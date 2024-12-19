package com.wora.MajesticCup.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "competitions")
public class Competition {
    @Id
    private String id;
    private String name;
    private int numberOfTeams;
    private List<Team> teams;
    @DBRef
    private Round currentRound;
    @DBRef
    private List<Round> rounds;
}

