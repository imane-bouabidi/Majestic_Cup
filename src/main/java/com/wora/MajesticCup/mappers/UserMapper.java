package com.wora.MajesticCup.mappers;

import com.wora.MajesticCup.dtos.User.CreateUserDTO;
import com.wora.MajesticCup.dtos.User.UpdateUserDTO;
import com.wora.MajesticCup.dtos.User.UserDTO;
import com.wora.MajesticCup.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserDTO userDTO);
    User toEntity(CreateUserDTO userDTO);
    User toEntity(UpdateUserDTO userDTO);
    UserDTO toDTO(User user);
}
