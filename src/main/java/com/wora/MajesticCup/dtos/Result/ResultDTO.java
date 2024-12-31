package com.wora.MajesticCup.dtos.Result;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResultDTO {
    @NotNull
    private String id;
    @NotNull
    private String matchId;
    @NotNull
    private int scoreTeam1;
    @NotNull
    private int scoreTeam2;
}
