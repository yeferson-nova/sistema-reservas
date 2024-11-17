package com.ynova.sistema_reservas.model;

import java.math.BigDecimal;


public class Prince {

    private Long id;
    private BigDecimal totalPrince;
    private BigDecimal totalTax;
    private BigDecimal basePrice;
   
    public BigDecimal getTotalPrice(){return totalPrince;}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTotalPrince() {
        return totalPrince;
    }

    public void setTotalPrince(BigDecimal totalPrince) {
        this.totalPrince = totalPrince;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    

}
