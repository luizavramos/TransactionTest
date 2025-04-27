package com.tech.test.service;

import com.tech.test.dto.TransactionRequestDTO;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TransactionService {

    private final List<TransactionRequestDTO> transacoes = new CopyOnWriteArrayList<>();


    public void criarTransacao(TransactionRequestDTO dto){

        if (dto.getDataHora().isAfter(OffsetDateTime.now())) {
            throw new IllegalArgumentException("Transação com data futura não permitida");
        }
        transacoes.add(dto);
    }

}
