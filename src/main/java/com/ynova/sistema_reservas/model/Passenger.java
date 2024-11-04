package com.ynova.sistema_reservas.model;

import java.time.LocalDate;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Passenger {

    private Long id;
    private String firsName;
    private String lastName;
    private String typeDcocument;
    private String documentNumber;
    private LocalDate birthDay;
    private String email;

}
