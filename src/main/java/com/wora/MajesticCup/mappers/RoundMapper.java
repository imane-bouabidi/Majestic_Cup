package com.wora.MajesticCup.mappers;

import com.wora.MajesticCup.dtos.Round.CreateRoundDTO;
import com.wora.MajesticCup.dtos.Round.RoundDTO;
import com.wora.MajesticCup.dtos.Round.UpdateRoundDTO;
import com.wora.MajesticCup.entities.Round;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoundMapper {
    RoundDTO toDTO(Round entity);
    Round toEntity(RoundDTO dto);
    Round toEntity(CreateRoundDTO dto);
    Round toEntity(UpdateRoundDTO updateDto);
}
