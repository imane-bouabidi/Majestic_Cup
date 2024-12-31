package com.wora.MajesticCup.services.Impl;

import com.wora.MajesticCup.dtos.Player.CreatePlayerDTO;
import com.wora.MajesticCup.dtos.Player.UpdatePlayerDTO;
import com.wora.MajesticCup.dtos.Player.PlayerDTO;
import com.wora.MajesticCup.entities.Player;
import com.wora.MajesticCup.exceptions.EntityNotFoundException;
import com.wora.MajesticCup.mappers.PlayerMapper;
import com.wora.MajesticCup.repositories.PlayerRepository;
import com.wora.MajesticCup.services.Intr.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;

    @Override
    public PlayerDTO save(CreatePlayerDTO createPlayerDTO) {
        Player player = playerMapper.toEntity(createPlayerDTO);
        Player savedPlayer = playerRepository.save(player);
        return playerMapper.toDTO(savedPlayer);
    }


    public PlayerDTO findById(String id) {
        Player player = playerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Player"));
        return playerMapper.toDTO(player);
    }

    @Override
    public PlayerDTO update(UpdatePlayerDTO updatePlayerDTO, String id) {
        Player player = playerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Player"));

        player.setName(updatePlayerDTO.getName());
        player.setPosition(updatePlayerDTO.getPosition());
        player.setNumber(updatePlayerDTO.getNumber());

        Player updatedPlayer = playerRepository.save(player);
        return playerMapper.toDTO(updatedPlayer);
    }

    @Override
    public List<PlayerDTO> findAll() {
        return playerRepository.findAll().stream()
                .map(playerMapper::toDTO)
                .toList();
    }

    @Override
    public void delete(String id) {
        Player player = playerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Player"));
        playerRepository.delete(player);
    }
}
