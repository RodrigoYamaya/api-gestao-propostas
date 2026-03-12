package com.RodSolution.Proposta.App.model.dto;


import java.math.BigDecimal;

public record PropostaRequestDto(
        String nome,
        String sobrenome,
        String telefone,
        String cpf,
        BigDecimal renda,
        BigDecimal valorSolicitado,
        int prazoPagamento


) {
}
