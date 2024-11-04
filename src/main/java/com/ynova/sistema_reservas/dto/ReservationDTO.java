package com.ynova.sistema_reservas.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReservationDTO {

    private Long id;
    private List<PassengerDTO> passengers;
    private ItineraryDTO itinerary;

    public List<PassengerDTO> getPassengers() {
        return passengers;
    }

}
