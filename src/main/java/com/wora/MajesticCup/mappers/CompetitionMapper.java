package com.wora.MajesticCup.mappers;

import com.wora.MajesticCup.dtos.Competition.CompetitionDTO;
import com.wora.MajesticCup.dtos.Competition.CreateCompetitionDTO;
import com.wora.MajesticCup.dtos.Competition.UpdateCompetitionDTO;
import com.wora.MajesticCup.entities.Competition;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompetitionMapper extends GenericMapper<CreateCompetitionDTO, UpdateCompetitionDTO, CompetitionDTO, Competition> {
}
