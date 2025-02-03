package com.ynova.sistema_reservas.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.core.convert.ConversionService;

import com.ynova.sistema_reservas.dto.ReservationDTO;
import com.ynova.sistema_reservas.enums.APIError;
import com.ynova.sistema_reservas.exception.MessageExceptions;
import com.ynova.sistema_reservas.model.Reservation;
import com.ynova.sistema_reservas.repository.ReservationRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    private ReservationRepository repository;
    private ConversionService conversionService;

    public ReservationService(ReservationRepository repository, ConversionService conversionService) {
        this.repository = repository;
        this.conversionService = conversionService;
    }

    public List<ReservationDTO> getReservations() {
        return  conversionService.convert(repository.getReservations(), List.class);
    }

    public ReservationDTO getReservationById(Long id) {
        Optional<Reservation> result = repository.getReservationById(id);
        if (result.isEmpty()) {
            throw new MessageExceptions(APIError.RESERVATION_NOT_FOUND);
        }
        return conversionService.convert(result.get(), ReservationDTO.class);
    }

    public ReservationDTO save(ReservationDTO reservation) {
        if (Objects.nonNull(reservation.getId())) {
            throw new MessageExceptions(APIError.RESERVATION_WITH_SAME_ID);
        }

        Reservation transformed = conversionService.convert(reservation, Reservation.class);
        Reservation result = repository.save(Objects.requireNonNull(transformed));
        return conversionService.convert(result, ReservationDTO.class);
    }

    public ReservationDTO update(Long id, ReservationDTO reservation) {
        if (getReservationById(id) == null) {
            throw new MessageExceptions(APIError.RESERVATION_NOT_FOUND);
        }

        Reservation transformed = conversionService.convert(reservation, Reservation.class);
        Reservation result = repository.update(id, Objects.requireNonNull(transformed));
        return conversionService.convert(result, ReservationDTO.class);
    }

    public void delete(Long id) {
        if (getReservationById(id) == null) {
            throw new MessageExceptions(APIError.RESERVATION_NOT_FOUND);
        }

        repository.delete(id);
    }
}
