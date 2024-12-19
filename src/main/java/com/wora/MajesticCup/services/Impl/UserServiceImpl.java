package com.wora.MajesticCup.services.Impl;

import com.wora.MajesticCup.config.CustomPasswordEncoder;
import com.wora.MajesticCup.dtos.User.CreateUserDTO;
import com.wora.MajesticCup.dtos.User.UpdateUserDTO;
import com.wora.MajesticCup.dtos.User.UserDTO;
import com.wora.MajesticCup.entities.User;
import com.wora.MajesticCup.mappers.UserMapper;
import com.wora.MajesticCup.repositories.UserRepository;
import com.wora.MajesticCup.services.Intr.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepo;
    private final CustomPasswordEncoder passwordEncoder;

    public UserDTO save(CreateUserDTO dto){
        User user = userMapper.toEntity(dto);
        if(dto.getUsername() != null){
            user.setUsername(dto.getUsername());
        }

        if(dto.getPassword() != null){
            user.setPassword(passwordEncoder.encode( dto.getPassword()));
        }

        if(dto.getRole() != null){
            user.setRole(dto.getRole());
        }

        User saved = userRepo.save(user);
        return userMapper.toDTO(saved);
    }
    public UserDTO update(UpdateUserDTO dto, String id) {
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
        List<User> users = userRepo.findAll();
        return users.stream()
                .map(userMapper::toDTO)
                .toList();
    }

    public void delete(String id) {

    }
}
