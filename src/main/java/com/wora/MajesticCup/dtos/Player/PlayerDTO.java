package com.wora.MajesticCup.dtos.Player;
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
    private int number;
}
