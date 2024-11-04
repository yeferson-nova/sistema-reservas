package com.ynova.sistema_reservas.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Segment {

    private long id;
    private String origin;
    private String destination;
    private String departure;
    private String arrival;
    private String carrier;

}
