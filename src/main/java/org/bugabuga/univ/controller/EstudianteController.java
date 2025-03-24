package org.bugabuga.univ.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudianteController {
    private final IEstudianteService studentService;

    @Autowired
    public EstudianteController(IEstudianteService studentService) {
        this.studentService = studentService;
    }
}