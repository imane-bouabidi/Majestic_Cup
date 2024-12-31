package com.wora.MajesticCup.mappers;

import com.wora.MajesticCup.dtos.Team.CreateTeamDTO;
import com.wora.MajesticCup.dtos.Team.TeamDTO;
import com.wora.MajesticCup.dtos.Team.UpdateTeamDTO;
import com.wora.MajesticCup.entities.Team;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface TeamMapper {
    TeamDTO toDTO(Team team);
    Team toEntity(TeamDTO teamDTO);
    Team toEntity(CreateTeamDTO createTeamDTO);
    Team toEntity(UpdateTeamDTO updateTeamDTO);
}
