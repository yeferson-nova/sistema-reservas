package com.ynova.sistema_reservas.model;



public class Segment {

    private long id;
    private String origin;
    private String destination;
    private String departure;
    private String arrival;
    private String carrier;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getDeparture() {
        return departure;
    }
    public void setDeparture(String departure) {
        this.departure = departure;
    }
    public String getArrival() {
        return arrival;
    }
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
    public String getCarrier() {
        return carrier;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    
}
