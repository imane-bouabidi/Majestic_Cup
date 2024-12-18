package com.wora.MajesticCup.dtos.Competition;

import com.wora.MajesticCup.entities.Round;
import com.wora.MajesticCup.entities.Team;
import lombok.*;

import java.util.List;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompetitionDTO {

    private Long id;
    @NonNull
    private String name;
    private int numberOfTeams;
    @NonNull
    private Round currentRound;
    private List<Round> rounds;
}
