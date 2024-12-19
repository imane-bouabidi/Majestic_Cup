package com.wora.MajesticCup.controllers;

import com.wora.MajesticCup.dtos.User.CreateUserDTO;
import com.wora.MajesticCup.dtos.User.UserDTO;
import com.wora.MajesticCup.services.Intr.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDTO> saveUser(@RequestBody @Validated CreateUserDTO dto){
        return ResponseEntity.ok(userService.save(dto));
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserDTO>> getUsers(){
        return ResponseEntity.ok(userService.findAll());
    }
}
