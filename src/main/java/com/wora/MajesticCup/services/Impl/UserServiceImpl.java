package com.wora.MajesticCup.services.Impl;

import com.wora.MajesticCup.dtos.User.CreateUserDTO;
import com.wora.MajesticCup.dtos.User.UpdateUserDTO;
import com.wora.MajesticCup.dtos.User.UserDTO;
import com.wora.MajesticCup.entities.User;
import com.wora.MajesticCup.mappers.UserMapper;
import com.wora.MajesticCup.repositories.UserRepository;
import com.wora.MajesticCup.services.Intr.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepo;

    public UserDTO save(CreateUserDTO dto){
        User user = userMapper.toEntity(dto);
        if(dto.getUsername() != null){
            user.setUsername(dto.getUsername());
        }

        if(dto.getPassword() != null){
            user.setPassword(dto.getPassword());
        }

        if(dto.getRole() != null){
            user.setRole(dto.getRole());
        }

        User saved = userRepo.save(user);
        return userMapper.toDTO(saved);
    }
    public UserDTO update(UpdateUserDTO dto, Long id) {
        User user = userMapper.toEntity(dto);

        if (dto.getUsername() != null) {
            user.setUsername(dto.getUsername());
        }

        if (dto.getPassword() != null) {
            user.setPassword(dto.getPassword());
        }

        if (dto.getRole() != null) {
            user.setRole(dto.getRole());
        }

        return userMapper.toDTO(userRepo.save(user));
    }
    public List<UserDTO> findAll() {
        return null;
    }

    public void delete(Long id) {

    }
}
