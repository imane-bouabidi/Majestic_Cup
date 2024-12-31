package com.wora.MajesticCup.services.Impl;

import com.wora.MajesticCup.dtos.Match.CreateMatchDTO;
import com.wora.MajesticCup.dtos.Match.UpdateMatchDTO;
import com.wora.MajesticCup.dtos.Match.MatchDTO;
import com.wora.MajesticCup.entities.Match;
import com.wora.MajesticCup.entities.Result;
import com.wora.MajesticCup.entities.Round;
import com.wora.MajesticCup.entities.Team;
import com.wora.MajesticCup.exceptions.EntityNotFoundException;
import com.wora.MajesticCup.mappers.MatchMapper;
import com.wora.MajesticCup.repositories.MatchRepository;
import com.wora.MajesticCup.repositories.ResultRepository;
import com.wora.MajesticCup.repositories.RoundRepository;
import com.wora.MajesticCup.repositories.TeamRepository;
import com.wora.MajesticCup.services.Intr.MatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MatchServiceImpl implements MatchService {
    private final MatchRepository matchRepository;
    private final MatchMapper matchMapper;
    private final TeamRepository teamRepository;
    private final ResultRepository resultRepository;
    private final RoundRepository roundRepository;

    @Override
    public MatchDTO save(CreateMatchDTO createMatchDTO) {
        Match match = matchMapper.toEntity(createMatchDTO);
        Match savedMatch = matchRepository.save(match);
        return matchMapper.toDTO(savedMatch);
    }

    public MatchDTO findById(String id) {
        Match match = matchRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Match"));
        return matchMapper.toDTO(match);
    }

    @Override
    public MatchDTO update(UpdateMatchDTO updateMatchDTO, String id) {
        Match match = matchRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Match"));
        Round round = roundRepository.findById(updateMatchDTO.getRoundId())
                .orElseThrow(() -> new EntityNotFoundException("Round"));

        match.setRound(round);

        Team team1 = teamRepository.findById(updateMatchDTO.getHomeTeamId())
                .orElseThrow(() -> new EntityNotFoundException("Team 1"));
        Team team2 = teamRepository.findById(updateMatchDTO.getAwayTeamId())
                .orElseThrow(() -> new EntityNotFoundException("Team 2"));

        match.setTeam1(team1);
        match.setTeam2(team2);

        if (updateMatchDTO.getResultId() != null) {
            Result result = resultRepository.findById(updateMatchDTO.getResultId())
                    .orElseThrow(() -> new EntityNotFoundException("Result"));
            match.setResult(result);
            match.setWinner(result.getTeam1Goals() > result.getTeam2Goals() ? team1 : team2);
        }

        Match updatedMatch = matchRepository.save(match);
        return matchMapper.toDTO(updatedMatch);
    }

    @Override
    public List<MatchDTO> findAll() {
        return matchRepository.findAll().stream()
                .map(matchMapper::toDTO)
                .toList();
    }

    @Override
    public void delete(String id) {
        Match match = matchRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Match"));
        matchRepository.delete(match);
    }
}
