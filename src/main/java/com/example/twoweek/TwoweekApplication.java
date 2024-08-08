package com.example.twoweek;

import com.example.twoweek.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.logging.Logger;

public class TwoweekApplication {

	private static final Logger log=Logger.getLogger(TwoweekApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(TwoweekApplication.class, args);
		ApplicationContext contex= new ClassPathXmlApplicationContext("applicationContext.xml");
		UserRepository userRepository =contex.getBean(UserRepository.class);

		log.info("the number of user is: "+ userRepository.getUsers().size());
	}
}
