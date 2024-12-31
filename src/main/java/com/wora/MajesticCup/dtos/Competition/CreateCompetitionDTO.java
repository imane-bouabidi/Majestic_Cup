package com.wora.MajesticCup.dtos.Competition;

import com.wora.MajesticCup.entities.Round;
import com.wora.MajesticCup.entities.Team;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateCompetitionDTO {
    private String name;
    private int numberOfTeams;
    private List<String> teamsIds;
}
