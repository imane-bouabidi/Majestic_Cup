package com.wora.MajesticCup;

import com.wora.MajesticCup.entities.User;
import com.wora.MajesticCup.entities.enums.Role;
import com.wora.MajesticCup.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MajesticCupApplication {

	public static void main(String[] args) {
		SpringApplication.run(MajesticCupApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(UserRepository rep) {
//		return args -> {
//			rep.deleteAll();
//			rep.save(new User(1L,"Imane", "00000", Role.ADMIN));
//		};
//	}


}
