package com.wora.MajesticCup.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "statistics")
public class Statistic {
    private Player player;
    private int goals;
    private int assists;
    private int yellowCards;
    private int redCards;
}
