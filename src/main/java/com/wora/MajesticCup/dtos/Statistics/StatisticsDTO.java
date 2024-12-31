package com.wora.MajesticCup.dtos.Statistics;
import com.wora.MajesticCup.entities.Player;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StatisticsDTO {
    @NotNull
    private String id;
    @NotNull
    private Player player;
    @NotNull
    private int goals;
    @NotNull
    private int assists;
    @NotNull
    private int yellowCards;
    @NotNull
    private int redCards;
}
