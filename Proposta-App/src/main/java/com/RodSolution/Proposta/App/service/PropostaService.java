package com.RodSolution.Proposta.App.service;

import com.RodSolution.Proposta.App.mapper.PropostaMapper;
import com.RodSolution.Proposta.App.model.dto.PropostaRequestDto;
import com.RodSolution.Proposta.App.model.dto.PropostaResponseDto;
import com.RodSolution.Proposta.App.model.entities.Proposta;
import com.RodSolution.Proposta.App.repository.PropostaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PropostaService {

    private final PropostaRepository propostaRepository;


    public PropostaResponseDto criar (PropostaRequestDto propostaDto) {
        Proposta proposta = PropostaMapper.INSTANCE.convertDtoToProposta(propostaDto);
         propostaRepository.save(proposta);
         return PropostaMapper.INSTANCE.convertEntityToDto(proposta);
    }


    public List<PropostaResponseDto> obterProposta() {
        return PropostaMapper.INSTANCE.convertListEntityToListDto(propostaRepository.findAll());
    }





}
