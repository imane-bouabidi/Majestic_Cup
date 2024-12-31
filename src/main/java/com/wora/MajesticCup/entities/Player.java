package com.wora.MajesticCup.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "players")

public class Player {
    @Id
    private String id;
    private String name;
    private String position;
    private int number;
    private Team team;
}

