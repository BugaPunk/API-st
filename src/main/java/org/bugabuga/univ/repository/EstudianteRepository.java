package org.bugabuga.univ.repository;

import org.bugabuga.univ.model.Estudiante;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class EstudianteRepository {
    private final Map<Long, Estudiante> estudiantes = new ConcurrentHashMap<>();
    private final AtomicLong idContador = new AtomicLong(1);

    public Estudiante save(Estudiante estudiante) {
        if (estudiante.getId() == null) {
            estudiante.setId(idContador.getAndIncrement());
        }
        this.estudiantes.put(estudiante.getId(), estudiante);
        return estudiante;
    }

    public List<Estudiante> findAll() {
        return new ArrayList<>(estudiantes.values());
    }
    
    public Estudiante findById(Long id) {
        return estudiantes.get(id);
    }

    public void deleteById(Long id) {
        estudiantes.remove(id);
    }

    public void init() {
        Estudiante studente1 = Estudiante.builder()
                .nombre("Estudiante 1")
                .apellido("App1")
                .email("estudiante1@gmail.com")
                .fechaNacimiento(LocalDate.of(2000, 5, 15))
                .numeroInscripcion("S001")
                .build();

        Estudiante student2 = Estudiante.builder()
                .nombre("Estudiante 2")
                .apellido("App2")
                .email("estudiante2@gmail.com")
                .fechaNacimiento(LocalDate.of(2000, 5, 15))
                .numeroInscripcion("S002")
                .build();
                
        save(studente1);
        save(student2);
    }
}