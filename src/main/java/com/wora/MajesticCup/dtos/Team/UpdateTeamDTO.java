package com.wora.MajesticCup.dtos.Team;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateTeamDTO {

    @NotNull
    private String name;
    @NotNull
    private String city;
    @NotNull
    private List<String> playersIds;
}
