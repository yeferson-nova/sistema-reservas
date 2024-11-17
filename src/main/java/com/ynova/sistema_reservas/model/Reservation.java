package com.ynova.sistema_reservas.model;

import java.util.List;


public class Reservation {

    private Long id;
    private List<Passenger> passengers;
    private Itinerary itinerary;

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    

}
