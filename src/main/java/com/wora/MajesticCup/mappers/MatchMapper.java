package com.wora.MajesticCup.mappers;

import com.wora.MajesticCup.dtos.Match.CreateMatchDTO;
import com.wora.MajesticCup.dtos.Match.MatchDTO;
import com.wora.MajesticCup.dtos.Match.UpdateMatchDTO;
import com.wora.MajesticCup.entities.Match;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MatchMapper {
    MatchDTO toDTO(Match entity);
    Match toEntity(MatchDTO dto);
    Match toEntity(CreateMatchDTO dto);
    Match toEntity(UpdateMatchDTO updateDto);
}
