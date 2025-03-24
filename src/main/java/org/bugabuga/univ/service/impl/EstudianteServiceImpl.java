package org.bugabuga.univ.service.impl;

import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import org.bugabuga.univ.dto.EstudianteDTO;
import org.bugabuga.univ.model.Estudiante;
import org.bugabuga.univ.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl {
    private final EstudianteRepository estudianteRepository;

    @Autowired
    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @PostConstruct
    public void init() {
        estudianteRepository.init();
    }

    public EstudianteDTO createStudent(EstudianteDTO estudianteDTO) {
        Estudiante estudiante = convertToEntity(estudianteDTO);
        Estudiante savedEstudiante = estudianteRepository.save(estudiante);
        return convertToDTO(savedEstudiante);
    }

    public List<EstudianteDTO> getAllStudents() {
        List<Estudiante> estudiantes = estudianteRepository.findAll();
        List<EstudianteDTO> estudiantesDTO = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            estudiantesDTO.add(convertToDTO(estudiante));
        }
        return estudiantesDTO;
    }

    public void deleteStudent(Long id) {
        estudianteRepository.deleteById(id);
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

    private EstudianteDTO convertToDTO(Estudiante estudiante) {
        return EstudianteDTO.builder()
                .id(estudiante.getId())
                .nombre(estudiante.getNombre())
                .apellido(estudiante.getApellido())
                .email(estudiante.getEmail())
                .fechaNacimiento(estudiante.getFechaNacimiento())
                .nroInscripcion(estudiante.getNumeroInscripcion())
                .build();
    }
}
