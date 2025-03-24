package org.bugabuga.univ.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MateriaDTO {
    private Long id;
    private String nombreMateria, codigoUnico;
    private Integer creditos;
}