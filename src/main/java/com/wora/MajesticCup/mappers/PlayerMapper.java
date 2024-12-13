package com.wora.MajesticCup.mappers;

import com.wora.MajesticCup.dtos.Player.CreatePlayerDTO;
import com.wora.MajesticCup.dtos.Player.PlayerDTO;
import com.wora.MajesticCup.dtos.Player.UpdatePlayerDTO;
import com.wora.MajesticCup.entities.Player;

public interface PlayerMapper extends GenericMapper<CreatePlayerDTO, UpdatePlayerDTO, PlayerDTO, Player>{
}
