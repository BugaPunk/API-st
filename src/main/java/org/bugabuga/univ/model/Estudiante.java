package org.bugabuga.univ.model;

import lombok.*;
import java.time.LocalDate;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Estudiante extends Persona {
    private String numeroInscripcion;
}
