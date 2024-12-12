package com.wora.MajesticCup.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "matches")
public class Match {
    private Long id;
    private int round;
    private Team team1;
    private Team team2;
    private Result result;
    private Team winner;
}

