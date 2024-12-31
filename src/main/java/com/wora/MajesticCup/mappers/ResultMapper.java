package com.wora.MajesticCup.mappers;

import com.wora.MajesticCup.dtos.Result.CreateResultDTO;
import com.wora.MajesticCup.dtos.Result.UpdateResultDTO;
import com.wora.MajesticCup.dtos.Result.ResultDTO;  // Assurez-vous d'importer le bon DTO
import com.wora.MajesticCup.entities.Result;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResultMapper {
    ResultDTO toDTO(Result entity);
    Result toEntity(ResultDTO dto);
    Result toEntity(CreateResultDTO dto);
    Result toEntity(UpdateResultDTO updateDto);
}
