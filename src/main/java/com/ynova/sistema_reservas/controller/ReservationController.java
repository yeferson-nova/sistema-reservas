package com.ynova.sistema_reservas.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ynova.sistema_reservas.dto.ReservationDTO;
import com.ynova.sistema_reservas.exception.MessageExceptions;
import com.ynova.sistema_reservas.service.ReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationService service;

    public ReservationController(ReservationService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ReservationDTO>> getReservations() {
        List<ReservationDTO> response = service.getReservations();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservationDTO> getReservationsById(@PathVariable Long id) {
        ReservationDTO respose = service.getReservationById(id);
        return new ResponseEntity<>(respose, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ReservationDTO> saveReservation(@RequestBody ReservationDTO reservation) {
        validateSave(reservation);
        return new ResponseEntity<>(reservation, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReservationDTO> updateReservation(@RequestBody ReservationDTO reservation,
            @PathVariable Long id) {
            validateUpdate(reservation);
        ReservationDTO response = service.update(id, reservation);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ReservationDTO> updateReservation(@PathVariable Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private void validateSave(ReservationDTO reservation){
        if(Objects.nonNull(reservation.getId()) ||
        Objects.isNull(reservation.getItinerary()) ||
        Objects.isNull(reservation.getPassengers())){
            throw new MessageExceptions("Something is not oaky, please check the root nodes");
        }
    }
    private void validateUpdate(ReservationDTO reservation){
        if(Objects.isNull(reservation.getId()) ||
        Objects.isNull(reservation.getItinerary()) ||
        Objects.isNull(reservation.getPassengers())){
            throw new MessageExceptions("Something is not oaky, please check the root nodes");
        }
    }

}
