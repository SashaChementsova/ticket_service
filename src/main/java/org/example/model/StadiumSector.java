package org.example.model;

import java.math.BigDecimal;

public enum StadiumSector {
    A(new BigDecimal(100)),
    B(new BigDecimal(250)),
    C(new BigDecimal(100));

    private BigDecimal minPrice;

    StadiumSector(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }
}
