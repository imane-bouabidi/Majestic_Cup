package com.wora.MajesticCup.controllers;

import com.wora.MajesticCup.dtos.Competition.CompetitionDTO;
import com.wora.MajesticCup.dtos.Competition.CreateCompetitionDTO;
import com.wora.MajesticCup.dtos.Competition.UpdateCompetitionDTO;
import com.wora.MajesticCup.dtos.Player.CreatePlayerDTO;
import com.wora.MajesticCup.dtos.Player.PlayerDTO;
import com.wora.MajesticCup.dtos.Player.UpdatePlayerDTO;
import com.wora.MajesticCup.dtos.Result.CreateResultDTO;
import com.wora.MajesticCup.dtos.Result.ResultDTO;
import com.wora.MajesticCup.dtos.Team.CreateTeamDTO;
import com.wora.MajesticCup.dtos.Team.TeamDTO;
import com.wora.MajesticCup.dtos.Team.UpdateTeamDTO;
import com.wora.MajesticCup.services.Intr.CompetitionService;
import com.wora.MajesticCup.services.Intr.PlayerService;
import com.wora.MajesticCup.services.Intr.ResultService;
import com.wora.MajesticCup.services.Intr.TeamService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {
    private final CompetitionService competitionService;
    private final TeamService teamService;
    private final PlayerService playerService;
    private final ResultService resultService;

    @PostMapping("/competitions")
    public ResponseEntity<CompetitionDTO> createCompetition(@RequestBody @Valid CreateCompetitionDTO createCreateCompetitionDTO) {
        return ResponseEntity.ok(competitionService.save(createCreateCompetitionDTO));
    }

    @GetMapping("/competitions/{id}")
    public ResponseEntity<CompetitionDTO> findCompetitionById(@PathVariable String id) {
        return ResponseEntity.ok(competitionService.findById(id));
    }

    @PutMapping("/competitions/{id}")
    public ResponseEntity<CompetitionDTO> updateCompetition(
            @RequestBody @Valid UpdateCompetitionDTO updateCreateCompetitionDTO,
            @PathVariable String id
    ) {
        return ResponseEntity.ok(competitionService.update(updateCreateCompetitionDTO, id));
    }

    @DeleteMapping("/competitions/{id}")
    public ResponseEntity<String> deleteCompetition(@PathVariable String id) {
        competitionService.delete(id);
        return ResponseEntity.ok("COMPETITION WITH ID: " + id + " DELETED SUCCESSFULLY !!");
    }

    @PostMapping("/teams")
    public ResponseEntity<TeamDTO> createTeam(@RequestBody @Valid CreateTeamDTO createTeamDTO) {
        return ResponseEntity.ok(teamService.save(createTeamDTO));
    }

    @GetMapping("/teams/{id}")
    public ResponseEntity<TeamDTO> findTeamById(@PathVariable String id) {
        return ResponseEntity.ok(teamService.findById(id));
    }

    @PutMapping("/teams/{id}")
    public ResponseEntity<TeamDTO> updateTeam(
            @RequestBody @Valid UpdateTeamDTO updateTeamDTO,
            @PathVariable String id
    ) {
        return ResponseEntity.ok(teamService.update(updateTeamDTO, id));
    }

    @DeleteMapping("/teams/{id}")
    public ResponseEntity<String> deleteTeam(@PathVariable String id) {
        teamService.delete(id);
        return ResponseEntity.ok("TEAM WITH ID: " + id + " DELETED SUCCESSFULLY !!");
    }

    @PostMapping("/players")
    public ResponseEntity<PlayerDTO> createPlayer(@RequestBody @Valid CreatePlayerDTO createPlayerDTO) {
        return ResponseEntity.ok(playerService.save(createPlayerDTO));
    }


    @GetMapping("/players/{id}")
    public ResponseEntity<PlayerDTO> findPlayerById(@PathVariable String id) {
        return ResponseEntity.ok(playerService.findById(id));
    }

    @PutMapping("/players/{id}")
    public ResponseEntity<PlayerDTO> updatePlayer(
            @RequestBody @Valid UpdatePlayerDTO updatePlayerDTO,
            @PathVariable String id
    ) {
        return ResponseEntity.ok(playerService.update(updatePlayerDTO, id));
    }

    @DeleteMapping("/players/{id}")
    public ResponseEntity<String> deletePlayer(@PathVariable String id) {
        playerService.delete(id);
        return ResponseEntity.ok("PLAYER WITH ID: " + id + " DELETED SUCCESSFULLY !!");
    }

    @PostMapping("/results")
    public ResponseEntity<ResultDTO> createResult(@RequestBody @Valid CreateResultDTO createResultDTO) {
        return ResponseEntity.ok(resultService.save(createResultDTO));
    }

    @GetMapping("/results/{id}")
    public ResponseEntity<ResultDTO> findResultById(@PathVariable String id) {
        return ResponseEntity.ok(resultService.findById(id));
    }

}
