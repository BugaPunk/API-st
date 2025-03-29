package org.bugabuga.univ.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Docente extends Persona {
    private String nroEmpleado, departamento;
}