package com.wora.MajesticCup.entities;

import com.wora.MajesticCup.entities.enums.Role;
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
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private Role role;
}


