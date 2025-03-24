package org.bugabuga.univ.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocenteDTO {
    private Long id;
    private String nombre, apellido, email, nroEmpleado, departamento;
    private LocalDate fechaNacimiento;
}