package com.wora.MajesticCup.services.Intr;

import com.wora.MajesticCup.dtos.Round.CreateRoundDTO;
import com.wora.MajesticCup.dtos.Round.RoundDTO;
import com.wora.MajesticCup.dtos.Round.UpdateRoundDTO;
import com.wora.MajesticCup.entities.Round;
import com.wora.MajesticCup.services.GenericService;
import org.springframework.stereotype.Service;

@Service
public interface RoundService extends GenericService<CreateRoundDTO, UpdateRoundDTO, RoundDTO, String> {
}
