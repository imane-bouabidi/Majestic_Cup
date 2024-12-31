package com.wora.MajesticCup.services.Impl;

import com.wora.MajesticCup.dtos.Team.CreateTeamDTO;
import com.wora.MajesticCup.dtos.Team.TeamDTO;
import com.wora.MajesticCup.dtos.Team.UpdateTeamDTO;
import com.wora.MajesticCup.entities.Player;
import com.wora.MajesticCup.entities.Team;
import com.wora.MajesticCup.exceptions.EntityNotFoundException;
import com.wora.MajesticCup.mappers.TeamMapper;
import com.wora.MajesticCup.repositories.PlayerRepository;
import com.wora.MajesticCup.repositories.TeamRepository;
import com.wora.MajesticCup.services.Intr.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {
    private final TeamRepository teamRepository;
    private final TeamMapper teamMapper;
    private final PlayerRepository playerRepository;

    @Override
    public TeamDTO save(CreateTeamDTO createTeamDTO) {
        Team team = teamMapper.toEntity(createTeamDTO);
        Team savedTeam = teamRepository.save(team);
        return teamMapper.toDTO(savedTeam);
    }

    public TeamDTO findById(String id) {
        Team team = teamRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Team"));
        return teamMapper.toDTO(team);
    }

    @Override
    public TeamDTO update(UpdateTeamDTO updateTeamDTO, String id) {
        Team team = teamRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Team"));

        team.setName(updateTeamDTO.getName());
        team.setCity(updateTeamDTO.getCity());

        List<Player> players = playerRepository.findAllById(updateTeamDTO.getPlayersIds());
        team.setPlayers(players);

        Team updatedTeam = teamRepository.save(team);
        return teamMapper.toDTO(updatedTeam);
    }

    @Override
    public List<TeamDTO> findAll() {
        return teamRepository.findAll().stream()
                .map(teamMapper::toDTO)
                .toList();
    }

    @Override
    public void delete(String id) {
        Team team = teamRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Team"));
        teamRepository.delete(team);
    }
}
