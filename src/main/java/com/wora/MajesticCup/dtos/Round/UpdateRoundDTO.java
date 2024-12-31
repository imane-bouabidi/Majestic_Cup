package com.wora.MajesticCup.dtos.Round;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateRoundDTO {
    @NotNull
    private String competitionId;
    @NotNull
    private int roundNumber;
}
