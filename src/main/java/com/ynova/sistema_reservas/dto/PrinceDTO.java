package com.ynova.sistema_reservas.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PrinceDTO {

    private BigDecimal totalPrince;
    private BigDecimal totalTax;
    private BigDecimal basePrice;
   
    public BigDecimal getTotalPrice(){return totalPrince;}

}
