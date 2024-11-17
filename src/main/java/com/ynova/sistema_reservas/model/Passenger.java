package com.ynova.sistema_reservas.model;

import java.time.LocalDate;



public class Passenger {

    private Long id;
    private String firstName;
    private String lastName;
    private String typeDcocument;
    private String documentNumber;
    private LocalDate birthDay;
    private String email;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getTypeDcocument() {
        return typeDcocument;
    }
    public void setTypeDcocument(String typeDcocument) {
        this.typeDcocument = typeDcocument;
    }
    public String getDocumentNumber() {
        return documentNumber;
    }
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }
    public LocalDate getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
