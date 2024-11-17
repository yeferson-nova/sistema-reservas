package com.ynova.sistema_reservas.mapper;

import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

import com.ynova.sistema_reservas.dto.PassengerDTO;
import com.ynova.sistema_reservas.dto.ReservationDTO;
import com.ynova.sistema_reservas.model.Passenger;
import com.ynova.sistema_reservas.model.Reservation;

@Mapper(componentModel = "spring")
public interface ReservationMapper extends Converter<Reservation, ReservationDTO> {
    @Override
    ReservationDTO convert(Reservation source);

    PassengerDTO convert(Passenger source);

}
