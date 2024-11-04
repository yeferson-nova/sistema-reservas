package com.ynova.sistema_reservas.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SegmentDTO {

    private String origin;
    private String destination;
    private String departure;
    private String arrival;
    private String carrier;

}
