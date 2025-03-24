package org.bugabuga.univ.model;

import lombok.*;
import java.time.LocalDate;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Estudiante {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fechaNacimiento;
    private String numeroInscripcion;
}
