package com.sam.commons.entities;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PriceDTO {

    private String title;

    private String description;

    private BigDecimal amount;

}
