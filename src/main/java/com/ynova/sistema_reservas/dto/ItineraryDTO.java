package com.ynova.sistema_reservas.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItineraryDTO {

    private List<SegmentDTO> segment;
    private PrinceDTO prince;

    public List<SegmentDTO> getSegmentDTOs() {
        return segment;
    }

    public void setSegmentDTOs(List<SegmentDTO> segmentDTOs) {
        this.segment = segment;
    }

    public PrinceDTO getPrince(){
        return prince;
    }
}
