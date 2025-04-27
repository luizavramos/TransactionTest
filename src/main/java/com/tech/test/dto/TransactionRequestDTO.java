package com.tech.test.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
public class TransactionRequestDTO {

    @NotNull(message = "O valor não pode ser nulo")
    @PositiveOrZero(message = "O valor deve ser zero ou positivo")
    private Double valor;

    @NotNull(message = "A dataHora não pode ser nula")
    private OffsetDateTime dataHora;

}
