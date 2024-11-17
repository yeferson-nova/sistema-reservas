package com.ynova.sistema_reservas.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PassengerDTO {
    @NotBlank(message = "firstName is mandatory")
    private String firstName;
    
    @NotBlank(message = "lastName is mandatory")
    private String lastName;

    @NotBlank(message = "typeDcocument is mandatory")
    private String typeDcocument;

    @NotBlank(message = "documentNumber is mandatory")
    private String documentNumber;

    @Past(message = "birthDay need to be a date in the past")
    private LocalDate birthDay;

    @Email
    private String email;

}
