package com.wora.MajesticCup.services.Intr;

import com.wora.MajesticCup.dtos.Team.CreateTeamDTO;
import com.wora.MajesticCup.dtos.Team.TeamDTO;
import com.wora.MajesticCup.dtos.Team.UpdateTeamDTO;
import com.wora.MajesticCup.entities.Team;
import com.wora.MajesticCup.services.GenericService;

public interface TeamService extends GenericService<CreateTeamDTO, UpdateTeamDTO, TeamDTO, Team> {
}
