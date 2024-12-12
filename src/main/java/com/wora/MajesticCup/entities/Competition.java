package com.wora.MajesticCup.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "competitions")
public class Competition {
    private Long id;
    private String name;
    private int numberOfTeams;
    private List<Team> teams;
    private Round currentRound;
    private List<Round> rounds;
}

