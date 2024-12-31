package com.wora.MajesticCup.dtos.Team;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TeamDTO {
    @NotNull
    private String id;
    @NotNull
    private String name;
    @NotNull
    private String city;

}