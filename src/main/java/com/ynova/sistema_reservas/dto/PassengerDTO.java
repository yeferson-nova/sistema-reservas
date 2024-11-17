package com.ynova.sistema_reservas.dto;

import java.time.LocalDate;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PassengerDTO {

    private String firstName;
    private String lastName;
    private String typeDcocument;
    private String documentNumber;
    private LocalDate birthDay;
    private String email;

}
