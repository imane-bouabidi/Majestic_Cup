package com.wora.MajesticCup.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "rounds")
public class Round {
    @Id
    private String id;
    private int roundNumber;
    @DBRef
    private Competition competition;
    @DBRef
    private List<Match> matches;
}

