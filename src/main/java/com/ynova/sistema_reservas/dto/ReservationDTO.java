package com.ynova.sistema_reservas.dto;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReservationDTO {

    private Long id;

    @Valid
    @NotBlank(message = "you need at least ine passenger")
    private List<PassengerDTO> passengers;

    @Valid
    private ItineraryDTO itinerary;

    public Long getId() {
        return id;
    }
    
    public List<PassengerDTO> getPassengers() {
        return passengers;
    }

}
