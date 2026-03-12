package com.RodSolution.Proposta.App.repository;

import com.RodSolution.Proposta.App.model.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
