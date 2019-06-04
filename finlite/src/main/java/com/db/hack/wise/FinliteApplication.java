package com.db.hack.wise;

import com.db.hack.wise.dao.SchoolInformationRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FinliteApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(FinliteApplication.class, args);


	}

}
