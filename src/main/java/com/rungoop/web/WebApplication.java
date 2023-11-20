package com.rungoop.web;

import com.rungoop.web.reponsitory.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;

@SpringBootApplication
@EnableScheduling
public class WebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	@Autowired
	private StationRepository stationRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(stationRepository.search());
	}

}
