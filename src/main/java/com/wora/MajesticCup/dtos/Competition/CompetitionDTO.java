package com.wora.MajesticCup.dtos.Competition;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompetitionDTO {
    private String id;
    private String name;
    private int numberOfTeams;
    private List<String> teamsIds;
    private String currentRoundId;
    private List<String> roundsIds;
}
