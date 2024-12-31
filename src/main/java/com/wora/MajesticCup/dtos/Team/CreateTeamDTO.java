package com.wora.MajesticCup.dtos.Team;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateTeamDTO {
    @NotNull
    private String name;
    @NotNull
    private String city;

}
