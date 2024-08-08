package com.example.twoweek;

import com.example.twoweek.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.*;

import java.util.Arrays;
import java.util.logging.Logger;

@SpringBootApplication
public class TwoweekApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	private static final Logger log=Logger.getLogger(TwoweekApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(TwoweekApplication.class,args);
	}
	public void run(String...args){
		log.info("Users in repository: "+ userRepository.getUsers().size());
	}
}
