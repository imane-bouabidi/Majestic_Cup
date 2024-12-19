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
@Document(collection = "results")
public class Result {
    @Id
    private String id;
    private int team1Goals;
    private int team2Goals;
    @DBRef
    private List<Statistic> statistics;
}

