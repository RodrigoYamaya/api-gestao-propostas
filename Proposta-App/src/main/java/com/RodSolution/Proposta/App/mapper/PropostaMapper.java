package com.RodSolution.Proposta.App.mapper;

import com.RodSolution.Proposta.App.model.dto.PropostaRequestDto;
import com.RodSolution.Proposta.App.model.dto.PropostaResponseDto;
import com.RodSolution.Proposta.App.model.entities.Proposta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

@Mapper(componentModel = "spring")
public interface PropostaMapper {

    PropostaMapper INSTANCE = Mappers.getMapper(PropostaMapper.class);

    @Mapping(target = "usuario.nome", source = "nome" )
    @Mapping(target = "usuario.sobrenome", source = "sobrenome" )
    @Mapping(target = "usuario.cpf", source = "cpf" )
    @Mapping(target = "usuario.telefone", source = "telefone")
    @Mapping(target = "usuario.renda", source = "renda")
    @Mapping(target = "id",ignore = true)
    @Mapping(target = "aprovado",ignore = true)
    @Mapping(target = "integrado",ignore = true)
    @Mapping(target = "observacao",ignore = true)
    Proposta convertDtoToProposta(PropostaRequestDto propostaDto);

    @Mapping(target = "nome", source = "usuario.nome")
    @Mapping(target = "sobrenome", source = "usuario.sobrenome")
    @Mapping(target = "telefone", source = "usuario.telefone")
    @Mapping(target = "cpf", source = "usuario.cpf")
    @Mapping(target = "renda", source = "usuario.renda")
    @Mapping(target = "valorSolicitadoFmt", expression = "java(setvalorSolicitadoFmt(proposta))")
    PropostaResponseDto convertEntityToDto(Proposta proposta);

    List<PropostaResponseDto> convertListEntityToListDto(Iterable<Proposta> proposta);

    //esse metodo java e fantastico ele formar certinho os valores e referente tambem a cada pais.
    // por exeplo no brasil 	R$ 15.000,50 essa formatação agora caso for EUA seria ja formatado certinho padrão americano ou europeu etc.
    default String setvalorSolicitadoFmt(Proposta proposta) {
        return NumberFormat.getCurrencyInstance().format(proposta.getValorSolicitado());
    }


}
