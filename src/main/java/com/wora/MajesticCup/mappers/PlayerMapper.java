package com.wora.MajesticCup.mappers;

import com.wora.MajesticCup.dtos.Player.CreatePlayerDTO;
import com.wora.MajesticCup.dtos.Player.PlayerDTO;
import com.wora.MajesticCup.dtos.Player.UpdatePlayerDTO;
import com.wora.MajesticCup.entities.Player;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlayerMapper {
    PlayerDTO toDTO(Player entity);
    Player toEntity(PlayerDTO dto);
    Player toEntity(CreatePlayerDTO dto);
    Player toEntity(UpdatePlayerDTO updateDto);
}
