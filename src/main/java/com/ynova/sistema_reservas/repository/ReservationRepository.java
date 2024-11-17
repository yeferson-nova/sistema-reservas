package com.ynova.sistema_reservas.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.ynova.sistema_reservas.model.Itinerary;
import com.ynova.sistema_reservas.model.Passenger;
import com.ynova.sistema_reservas.model.Prince;
import com.ynova.sistema_reservas.model.Reservation;
import com.ynova.sistema_reservas.model.Segment;

@Component
public class ReservationRepository {

    static List<Reservation> reservations = new ArrayList<>();
    static {

        Passenger passenger = new Passenger();
        passenger.setFirstName("Andres");
        passenger.setLastName("Sacco");
        passenger.setId(1L);
        passenger.setDocumentNumber("DNI");
        passenger.setDocumentNumber("12345678");
        passenger.setBirthDay(LocalDate.of(1985, 1, 1));

        Prince price = new Prince();
        price.setBasePrice(BigDecimal.ONE);
        price.setTotalTax(BigDecimal.ZERO);
        price.setTotalPrince(BigDecimal.ONE);

        Segment segment = new Segment();
        segment.setArrival("2025-01-01");
        segment.setDeparture("2024-12-31");
        segment.setOrigin("EZE");
        segment.setDestination("MIA");
        segment.setCarrier("AA");
        segment.setId(1L);

        Itinerary itinerary = new Itinerary();
        itinerary.setId(1L);
        itinerary.setPrince(price);
        itinerary.setSegment(List.of(segment));

        Reservation reservation = new Reservation();
        reservation.setId(1L);
        reservation.setPassengers(List.of(passenger));
        reservation.setItinerary(itinerary);

        reservations.add(reservation);
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public Optional<Reservation> getReservationById(Long id) {
        List<Reservation> result = reservations.stream()
                .filter(reservation -> Objects.equals(reservation.getId(), id)).toList();

        Reservation reservation = !result.isEmpty() ? result.get(0) : null;
        return Optional.ofNullable(reservation);

    }

    public Reservation save(Reservation reservation) {
        reservation.setId((long) (reservations.size() + 1));
        reservations.add(reservation);
        return reservation;
    }

    public Reservation update(Long id, Reservation reservation) {
        List<Reservation> result = reservations.stream()
                .filter(reser -> reser.getId().equals(id))
                .toList();
        result.get(0).setId(reservation.getId());
        result.get(0).setItinerary(reservation.getItinerary());
        result.get(0).setPassengers(reservation.getPassengers());

        return result.get(0);
    }

    public void delete(Long id) {
        List<Reservation> result = reservations.stream()
                .filter(reservation -> reservation.getId().equals(id))
                .toList();

        reservations.remove(result.get(0));
    }

}
