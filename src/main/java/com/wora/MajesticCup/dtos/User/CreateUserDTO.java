package com.wora.MajesticCup.dtos.User;

import com.wora.MajesticCup.entities.enums.Role;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateUserDTO {
    private String username;
    private String password;
    private Role role;
}
