package com.RodSolution.Proposta.App.model.dto;

import com.RodSolution.Proposta.App.model.entities.Proposta;

import java.math.BigDecimal;

public record UsuarioResponseDto(
      Long id,
      String nome,
      String sobrenome,
      String telefone,
      BigDecimal renda,
      Proposta proposta
) {
}
