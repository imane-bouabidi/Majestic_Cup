package com.wora.MajesticCup.dtos.Result;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateResultDTO {
    @NotNull
    private String matchId;
    @NotNull
    private int scoreTeam1;
    @NotNull
    private int scoreTeam2;
}
