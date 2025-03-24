package org.bugabuga.univ.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Materia {
    private Long id;
    private String nombreMateria, codigoUnico;
    private Integer creditos;
}
