package org.bugabuga.univ.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstudianteDTO {
    private Long id;
    private String nombre, apellido, email, nroInscripcion;
    private LocalDate fechaNacimiento;
}