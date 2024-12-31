package com.wora.MajesticCup.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "matches")
public class Match {
    @Id
    private String id;
    private Round round;
    private Team team1;
    private Team team2;
    @DBRef
    private Result result;
    private Team winner;
}

