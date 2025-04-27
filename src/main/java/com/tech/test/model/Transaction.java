package com.tech.test.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
public class Transaction {
    private Double valor;
    private OffsetDateTime dataHora;
}
