package com.wora.MajesticCup.mappers;

import com.wora.MajesticCup.dtos.Round.CreateRoundDTO;
import com.wora.MajesticCup.dtos.Round.RoundDTO;
import com.wora.MajesticCup.dtos.Round.UpdateRoundDTO;
import com.wora.MajesticCup.entities.Round;

public interface RoundMapper extends GenericMapper<CreateRoundDTO, UpdateRoundDTO, RoundDTO, Round> {
}
