package com.RodSolution.Proposta.App.controller;

import com.RodSolution.Proposta.App.model.dto.PropostaRequestDto;
import com.RodSolution.Proposta.App.model.dto.PropostaResponseDto;
import com.RodSolution.Proposta.App.service.PropostaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/proposta")
public class PropostaController {

    private final PropostaService propostaService;

    @PostMapping()
    public ResponseEntity<PropostaResponseDto> criar(@RequestBody PropostaRequestDto propostaDto) {
        PropostaResponseDto criarProposta = propostaService.criar(propostaDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(criarProposta);
    }

    @GetMapping
    public ResponseEntity<List<PropostaResponseDto>> obterProposta() {
        return ResponseEntity.ok(propostaService.obterProposta());

    }


}