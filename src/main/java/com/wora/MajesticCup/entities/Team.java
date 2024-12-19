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
@Document(collection = "teams")
public class Team {

    @Id
    private String id;
    private String name;
    private String city;
    @DBRef
    private List<Player> players;
}

