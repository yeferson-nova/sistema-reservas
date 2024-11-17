package com.ynova.sistema_reservas.dto;

import com.ynova.sistema_reservas.validation.ICityFormatConstraint;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SegmentDTO {

    @NotBlank
    @ICityFormatConstraint
    private String origin;

    @ICityFormatConstraint
    private String destination;
    private String departure;
    private String arrival;
    private String carrier;

}
