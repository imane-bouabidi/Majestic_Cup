package com.wora.MajesticCup.dtos.Round;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateRoundDTO {
    @NotNull
    private String competitionId;
    @NotNull
    private int roundNumber;
}
