package com.wora.MajesticCup.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "rounds")
public class Round {
    private Long id;
    private int roundNumber;
    private Competition competition;
    private List<Match> matches;
}

