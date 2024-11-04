package com.ynova.sistema_reservas.exception;

public class MessageExceptions extends RuntimeException {

    private String description;

    public MessageExceptions(String message) {
        super(message);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}