package org.bugabuga.univ.service;

import org.bugabuga.univ.dto.EstudianteDTO;
import java.util.List;
import java.util.Optional;

public interface IEstudianteService {
    List<EstudianteDTO> getTodosLosEstudiantes();
    Optional<EstudianteDTO> getEstudiantePorId(Long id);
    EstudianteDTO actualizarEstudiante(Long id, EstudianteDTO estudianteDTO);
}
