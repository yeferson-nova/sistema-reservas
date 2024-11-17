package com.ynova.sistema_reservas.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

import com.ynova.sistema_reservas.dto.PassengerDTO;
import com.ynova.sistema_reservas.dto.ReservationDTO;
import com.ynova.sistema_reservas.model.Passenger;
import com.ynova.sistema_reservas.model.Reservation;

@Mapper(componentModel = "spring")
public interface ReservationsMapper extends Converter<List<Reservation>, List<ReservationDTO>> {

    @Override
    List<ReservationDTO> convert(List<Reservation> source);

    PassengerDTO toPassengerDTO(Passenger passenger);

    Passenger toPassenger(PassengerDTO passengerDTO);

    List<PassengerDTO> toPassengerDTOList(List<Passenger> passengers);

    List<Passenger> toPassengerList(List<PassengerDTO> passengerDTOs);

}
