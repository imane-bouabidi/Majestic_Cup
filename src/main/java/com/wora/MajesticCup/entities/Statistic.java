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
@Document(collection = "statistics")
public class Statistic {
    @Id
    private String id;
    @DBRef
    private Player player;
    private int goals;
    private int assists;
    private int yellowCards;
    private int redCards;
}
