package org.bugabuga.univ.service;

import org.bugabuga.univ.dto.EstudianteDTO;
import java.util.List;

interface IEstudiante {
    EstudianteDTO createStudent(EstudianteDTO estudianteDTO);
    List<EstudianteDTO>getAllStudents();
    public void deleteStudent(Long id);
    
    
}
