package com.wora.MajesticCup.dtos.User;

import com.wora.MajesticCup.entities.enums.Role;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateUserDTO {
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private Role role;
}
