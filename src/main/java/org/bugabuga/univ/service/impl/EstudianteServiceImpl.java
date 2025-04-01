package org.bugabuga.univ.service.impl;

import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.bugabuga.univ.dto.EstudianteDTO;
import org.bugabuga.univ.model.Estudiante;
import org.bugabuga.univ.repository.EstudianteRepository;
import org.bugabuga.univ.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl implements IEstudianteService {
    private final EstudianteRepository estudianteRepository;

    @Autowired
    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @PostConstruct
    public void init() {
        estudianteRepository.init();
    }

    @Override
    public List<EstudianteDTO> getTodosLosEstudiantes() {
        List<Estudiante> estudiantes = estudianteRepository.findAll();
        List<EstudianteDTO> estudiantesDTO = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            estudiantesDTO.add(convertToDTO(estudiante));
        }
        return estudiantesDTO;
    }
    
    @Override
    public Optional<EstudianteDTO> getEstudiantePorId(Long id) {
        Estudiante estudiante = estudianteRepository.findById(id);
        if (estudiante == null) {
            return Optional.empty();
        }
        return Optional.of(convertToDTO(estudiante));
    }
    
    @Override
    public EstudianteDTO actualizarEstudiante(Long id, EstudianteDTO estudianteDTO) {
        Estudiante estudianteExistente = estudianteRepository.findById(id);
        if (estudianteExistente == null) {
            return null;
        }
        
        // Actualizar los datos del estudiante existente
        estudianteExistente.setNombre(estudianteDTO.getNombre());
        estudianteExistente.setApellido(estudianteDTO.getApellido());
        estudianteExistente.setEmail(estudianteDTO.getEmail());
        estudianteExistente.setFechaNacimiento(estudianteDTO.getFechaNacimiento());
        estudianteExistente.setNumeroInscripcion(estudianteDTO.getNroInscripcion());
        
        // Guardar el estudiante actualizado
        Estudiante estudianteActualizado = estudianteRepository.save(estudianteExistente);
        
        return convertToDTO(estudianteActualizado);
    }

    private EstudianteDTO convertToDTO(Estudiante entity) {
        return EstudianteDTO.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .apellido(entity.getApellido())
                .email(entity.getEmail())
                .fechaNacimiento(entity.getFechaNacimiento())
                .nroInscripcion(entity.getNumeroInscripcion())
                .build();
    }

    private Estudiante convertToEntity(EstudianteDTO dto) {
        return Estudiante.builder()
                .id(dto.getId())
                .nombre(dto.getNombre())
                .apellido(dto.getApellido())
                .email(dto.getEmail())
                .fechaNacimiento(dto.getFechaNacimiento())
                .numeroInscripcion(dto.getNroInscripcion())
                .build();
    }
}
