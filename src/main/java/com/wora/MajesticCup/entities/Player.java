package com.wora.MajesticCup.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "players")

public class Player {

    private Long id;
    private String name;
    private String position;
    private int number;
}

