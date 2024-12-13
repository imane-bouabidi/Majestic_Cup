package com.wora.MajesticCup.services.Intr;

import com.wora.MajesticCup.dtos.Competition.CompetitionDTO;
import com.wora.MajesticCup.dtos.Competition.CreateCompetitionDTO;
import com.wora.MajesticCup.dtos.Competition.UpdateCompetitionDTO;
import com.wora.MajesticCup.entities.Competition;
import com.wora.MajesticCup.services.GenericService;

public interface CompetitionService extends GenericService<CreateCompetitionDTO, UpdateCompetitionDTO, CompetitionDTO, Competition> {
}
