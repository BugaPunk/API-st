package org.bugabuga.univ.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Docente {
    private String nroEmpleado, departamento;
}