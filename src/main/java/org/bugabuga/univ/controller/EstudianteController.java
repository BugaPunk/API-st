package org.bugabuga.univ.controller;

import org.bugabuga.univ.dto.EstudianteDTO;
import org.bugabuga.univ.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EstudianteController {
    private final IEstudianteService estudianteService;

    @Autowired
    public EstudianteController(IEstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping("/estudiantes")
    public ResponseEntity<List<EstudianteDTO>> getTodosLosEstudiantes() {
        List<EstudianteDTO> estudiantes = estudianteService.getTodosLosEstudiantes();
        return ResponseEntity.ok(estudiantes);
    }
}