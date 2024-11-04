package com.ynova.sistema_reservas.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Prince {

    private Long id;
    private BigDecimal totalPrince;
    private BigDecimal totalTax;
    private BigDecimal basePrice;
   
    public BigDecimal getTotalPrice(){return totalPrince;}

}
