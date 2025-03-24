package org.bugabuga.univ.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class Persona {
    private Long id;
    private String nombre, apellido, email;
    private LocalDate fechaNacimiento;
}