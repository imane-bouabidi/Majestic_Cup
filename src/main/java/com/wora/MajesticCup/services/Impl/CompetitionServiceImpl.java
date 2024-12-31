package com.wora.MajesticCup.services.Impl;

import com.wora.MajesticCup.entities.Round;
import com.wora.MajesticCup.entities.Team;
import com.wora.MajesticCup.exceptions.EntityNotFoundException;
import com.wora.MajesticCup.mappers.CompetitionMapper;
import com.wora.MajesticCup.dtos.Competition.CompetitionDTO;
import com.wora.MajesticCup.dtos.Competition.CreateCompetitionDTO;
import com.wora.MajesticCup.dtos.Competition.UpdateCompetitionDTO;
import com.wora.MajesticCup.entities.Competition;
import com.wora.MajesticCup.repositories.CompetitionRepository;
import com.wora.MajesticCup.repositories.RoundRepository;
import com.wora.MajesticCup.repositories.TeamRepository;
import com.wora.MajesticCup.services.Intr.CompetitionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompetitionServiceImpl implements CompetitionService {
    private final CompetitionRepository competitionRepository;
    private final CompetitionMapper competitionMapper;
    private final TeamRepository teamRepository;
    private final RoundRepository roundRepository;

    @Override
    public CompetitionDTO save(CreateCompetitionDTO createCompetitionDTO) {
        Competition competition = competitionMapper.CreateToEntity(createCompetitionDTO);
        Competition savedCompetition = competitionRepository.save(competition);
        return competitionMapper.toDTO(savedCompetition);
    }

    public CompetitionDTO findById(String id) {
        Competition competition = competitionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Competition"));
        return competitionMapper.toDTO(competition);
    }
    @Override
    public CompetitionDTO update(UpdateCompetitionDTO updateCompetitionDTO, String id) {
        Competition competition = competitionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Competition"));

        competition.setName(updateCompetitionDTO.getName());
        competition.setNumberOfTeams(updateCompetitionDTO.getNumberOfTeams());

        List<Team> teams = teamRepository.findAllById(updateCompetitionDTO.getTeamsIds());
        List<Round> rounds = roundRepository.findAllById(updateCompetitionDTO.getRoundsIds());

        competition.setTeams(teams);
        competition.setRounds(rounds);

        Competition updatedCompetition = competitionRepository.save(competition);
        return competitionMapper.toDTO(updatedCompetition);
    }
    @Override
    public List<CompetitionDTO> findAll() {
        return competitionRepository.findAll().stream()
                .map(competitionMapper::toDTO)
                .toList();
    }

    @Override
    public void delete(String id) {
        Competition competition = competitionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Competition"));
        competitionRepository.delete(competition);
    }
}
