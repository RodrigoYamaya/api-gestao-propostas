package com.RodSolution.Proposta.App.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name= "tb_proposta")
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "valorsolicitado")
    private BigDecimal valorSolicitado;

    @Column(name = "prazopagamento")
    private int prazoPagamento;

    private Boolean aprovado;

    private boolean integrado;

    private String observacao;

    //Utlizando cascade.Persist ele vai salvar usuario para min automaticamente pai e filho.
    // Porque esta tendo problema que eu salvava a prorposta ,mas usuairo era null.Resolvemos isso com cascade.PERSIST
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="id_usuario")
    private Usuario usuario;








}
