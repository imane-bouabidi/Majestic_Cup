package com.wora.MajesticCup.dtos.Round;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoundDTO {
    @NotNull
    private String id;
    @NotNull
    private String competitionId;
    @NotNull
    private int roundNumber;
}
