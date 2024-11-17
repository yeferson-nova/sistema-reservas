package com.ynova.sistema_reservas.model;

import java.util.List;



public class Itinerary {

    private Long id;

    private List<Segment> segment;
    private Prince prince;

    public List<Segment> getSegments() {
        return segment;
    }

    public void setSegment(List<Segment> segments) {
        this.segment = segment;
    }

    public Prince getPrince(){
        return prince;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Segment> getSegment() {
        return segment;
    }

    public void setPrince(Prince prince) {
        this.prince = prince;
    }

    
}
