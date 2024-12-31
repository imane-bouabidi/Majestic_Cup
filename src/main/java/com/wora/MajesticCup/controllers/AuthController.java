package com.wora.MajesticCup.controllers;

import com.wora.MajesticCup.dtos.User.CreateUserDTO;
import com.wora.MajesticCup.dtos.User.UserDTO;
import com.wora.MajesticCup.services.Impl.UserServiceImpl;
import com.wora.MajesticCup.security.JwtTokenProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserServiceImpl userServiceImpl;
    private final JwtTokenProvider jwtTokenProvider;

    public AuthController(UserServiceImpl userServiceImpl, JwtTokenProvider jwtTokenProvider) {
        this.userServiceImpl = userServiceImpl;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @PostMapping("/register")
    public ResponseEntity<UserDTO> register(@RequestBody CreateUserDTO createUserDTO) {
        UserDTO userDTO = userServiceImpl.save(createUserDTO);
        return ResponseEntity.ok(userDTO);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        String token = jwtTokenProvider.generateToken(username);
        return ResponseEntity.ok("Bearer " + token);
    }
}
