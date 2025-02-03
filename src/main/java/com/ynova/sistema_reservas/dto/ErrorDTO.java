package com.ynova.sistema_reservas.dto;

import java.util.List;

public class ErrorDTO {

    private String description;
    private List<String> reason;

    public ErrorDTO(String description, List<String> reason) {
        this.description = description;
        this.reason = reason;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getReason() {
        return reason;
    }

    public void setReason(List<String> reason) {
        this.reason = reason;
    }

}
