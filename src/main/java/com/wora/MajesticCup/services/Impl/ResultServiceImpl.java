package com.wora.MajesticCup.services.Impl;

import com.wora.MajesticCup.dtos.Result.CreateResultDTO;
import com.wora.MajesticCup.dtos.Result.ResultDTO;
import com.wora.MajesticCup.dtos.Result.UpdateResultDTO;
import com.wora.MajesticCup.entities.Result;
import com.wora.MajesticCup.mappers.ResultMapper;
import com.wora.MajesticCup.repositories.ResultRepository;
import com.wora.MajesticCup.services.Intr.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ResultServiceImpl implements ResultService {
    private final ResultRepository resultRepository;
    private final ResultMapper resultMapper;

    @Override
    public ResultDTO save(CreateResultDTO createResultDTO) {
        Result result = resultMapper.toEntity(createResultDTO);
        Result savedResult = resultRepository.save(result);
        return resultMapper.toDTO(savedResult);
    }

    @Override
    public ResultDTO update(UpdateResultDTO updateResultDTO, String id) {
        Optional<Result> existingResult = resultRepository.findById(id);

        if (existingResult.isPresent()) {
            Result result = existingResult.get();
            result.setTeam1Goals(updateResultDTO.getScoreTeam1());
            result.setTeam2Goals(updateResultDTO.getScoreTeam2());
            result.setStatistics(result.getStatistics());

            Result updatedResult = resultRepository.save(result);
            return resultMapper.toDTO(updatedResult);
        } else {
            throw new RuntimeException("Result with id " + id + " not found");
        }
    }

    @Override
    public List<ResultDTO> findAll() {
        List<Result> results = resultRepository.findAll();
        return results.stream()
                .map(resultMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ResultDTO findById(String id) {
        Optional<Result> result = resultRepository.findById(id);

        if (result.isPresent()) {
            return resultMapper.toDTO(result.get());
        } else {
            throw new RuntimeException("Result with id " + id + " not found");
        }
    }

    @Override
    public void delete(String id) {
        Optional<Result> existingResult = resultRepository.findById(id);

        if (existingResult.isPresent()) {
            resultRepository.delete(existingResult.get());
        } else {
            throw new RuntimeException("Result with id " + id + " not found");
        }
    }
}
