package com.wora.MajesticCup.services.Intr;

import com.wora.MajesticCup.dtos.Match.CreateMatchDTO;
import com.wora.MajesticCup.dtos.Match.MatchDTO;
import com.wora.MajesticCup.dtos.Match.UpdateMatchDTO;
import com.wora.MajesticCup.entities.Match;
import com.wora.MajesticCup.services.GenericService;

public interface MatchService extends GenericService<CreateMatchDTO, UpdateMatchDTO, MatchDTO, Match> {
}
