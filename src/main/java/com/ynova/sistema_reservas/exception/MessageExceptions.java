package com.ynova.sistema_reservas.exception;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.ynova.sistema_reservas.enums.APIError;

public class MessageExceptions extends RuntimeException {

    private HttpStatus status;
    private String description;
    private List<String> reasons;

    public MessageExceptions(APIError error) {
        this.status = error.getHttpStatus();
        this.description = error.getMessage();
    }

    public MessageExceptions(HttpStatus status, String desctiption, List<String> reasons) {
        this.status = status;
        this.description = desctiption;
        this.reasons = reasons;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getReasons() {
        return reasons;
    }

    public void setReasons(List<String> reasons) {
        this.reasons = reasons;
    }

}