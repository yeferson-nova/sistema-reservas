package com.ynova.sistema_reservas.mapper;

import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

import com.ynova.sistema_reservas.dto.ReservationDTO;
import com.ynova.sistema_reservas.model.Reservation;


@Mapper(componentModel = "spring") 
public interface ReservationDTOMapper extends Converter<ReservationDTO,Reservation>{

    @Override
    Reservation convert(ReservationDTO source);
    
}

