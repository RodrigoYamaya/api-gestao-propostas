package com.RodSolution.Proposta.App.model.dto;


import java.math.BigDecimal;

public record PropostaResponseDto(
        Long id,
        String nome,
        String sobrenome,
        String telefone,
        String cpf,
        BigDecimal renda,
        String valorSolicitadoFmt,
        int prazoPagamento,
        Boolean aprovado,
        String observacao
) {
}
