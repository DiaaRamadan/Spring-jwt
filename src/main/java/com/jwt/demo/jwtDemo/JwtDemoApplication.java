package com.jwt.demo.jwtDemo;

import com.jwt.demo.jwtDemo.domain.Role;
import com.jwt.demo.jwtDemo.domain.User;
import com.jwt.demo.jwtDemo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class JwtDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtDemoApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}


	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
//			userService.saveRole(new Role(null, "ROLE_USER"));
//			userService.saveRole(new Role(null, "ROLE_MANAGER"));
//			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
//			userService.saveRole(new Role(null, "ROLE_USER_ADMIN"));
//
//			userService.saveUser(new User(null, "Koko", "koko", "12345678", new ArrayList<>()));
//			userService.saveUser(new User(null, "John", "john", "12345678", new ArrayList<>()));
//			userService.saveUser(new User(null, "Maria", "maria", "12345678", new ArrayList<>()));
//			userService.saveUser(new User(null, "Aya", "aya", "12345678", new ArrayList<>()));
//
//			userService.addRoleToUser("koko", "ROLE_USER");
//			userService.addRoleToUser("koko", "ROLE_MANAGER");
//			userService.addRoleToUser("john", "ROLE_MANAGER");
//			userService.addRoleToUser("maria", "ROLE_SUPER_ADMIN");
//			userService.addRoleToUser("aya", "ROLE_USER_ADMIN");
//			userService.addRoleToUser("aya", "ROLE_SUPER_ADMIN");
//			userService.addRoleToUser("aya", "ROLE_MANAGER");
		};
	}

}
