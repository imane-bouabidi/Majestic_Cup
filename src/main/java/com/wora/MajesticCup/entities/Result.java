package com.wora.MajesticCup.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "results")
public class Result {
    private int team1Goals;
    private int team2Goals;
    private List<Statistic> statistics;
}

