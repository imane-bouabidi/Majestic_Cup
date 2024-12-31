package com.wora.MajesticCup.dtos.Match;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateMatchDTO {
    @NotNull
    private String homeTeamId;
    @NotNull
    private String awayTeamId;
    @NotNull
    private String competitionId;
    private String date;
}
