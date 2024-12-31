package com.wora.MajesticCup.dtos.Match;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateMatchDTO {
    private String homeTeamId;
    private String awayTeamId;
    private String roundId;
    private String resultId;
}