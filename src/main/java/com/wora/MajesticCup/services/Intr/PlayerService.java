package com.wora.MajesticCup.services.Intr;

import com.wora.MajesticCup.dtos.Player.CreatePlayerDTO;
import com.wora.MajesticCup.dtos.Player.PlayerDTO;
import com.wora.MajesticCup.dtos.Player.UpdatePlayerDTO;
import com.wora.MajesticCup.entities.Player;
import com.wora.MajesticCup.services.GenericService;
import org.springframework.stereotype.Service;

@Service
public interface PlayerService extends GenericService<CreatePlayerDTO, UpdatePlayerDTO, PlayerDTO, Long> {
}
