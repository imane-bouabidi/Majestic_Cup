package com.wora.MajesticCup.mappers;

import com.wora.MajesticCup.dtos.Match.CreateMatchDTO;
import com.wora.MajesticCup.dtos.Match.MatchDTO;
import com.wora.MajesticCup.dtos.Match.UpdateMatchDTO;
import com.wora.MajesticCup.entities.Match;

public interface MatchMapper extends GenericMapper<CreateMatchDTO, UpdateMatchDTO, MatchDTO, Match> {
}
