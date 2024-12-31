package com.wora.MajesticCup.dtos.Match;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MatchDTO {
    private String id;
    private String homeTeamId;
    private String awayTeamId;
    private String competitionId;
    private String winnerTeamId;
}
