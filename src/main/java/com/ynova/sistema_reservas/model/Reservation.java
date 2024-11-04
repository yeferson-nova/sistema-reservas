package com.ynova.sistema_reservas.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Reservation {

    private Long id;
    private List<Passenger> passengers;
    private Itinerary itinerary;

    public List<Passenger> getPassengers() {
        return passengers;
    }

}
