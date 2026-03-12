package com.RodSolution.Proposta.App.repository;

import com.RodSolution.Proposta.App.model.entities.Proposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropostaRepository extends JpaRepository<Proposta,Long> {
}
