package com.wora.MajesticCup.services.Intr;

import com.wora.MajesticCup.dtos.User.CreateUserDTO;
import com.wora.MajesticCup.dtos.User.UpdateUserDTO;
import com.wora.MajesticCup.dtos.User.UserDTO;
import com.wora.MajesticCup.services.GenericService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends GenericService<CreateUserDTO, UpdateUserDTO, UserDTO, String> {
}
