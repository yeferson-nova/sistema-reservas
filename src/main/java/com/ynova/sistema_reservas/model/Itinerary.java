package com.ynova.sistema_reservas.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
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
}
