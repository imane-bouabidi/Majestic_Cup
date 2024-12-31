package com.wora.MajesticCup.dtos.Player;
import com.wora.MajesticCup.entities.Team;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PlayerDTO {
    @NotNull
    private String id;
    @NotNull
    private String name;
    @NotNull
    private String position;
    @NotNull
    private int number;
//    @NotNull
//    private Team team;
}
