package com.rungoop.web;

import com.rungoop.web.entity.Branch;
import com.rungoop.web.reponsitory.BranchRepository;
import com.rungoop.web.reponsitory.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;

@SpringBootApplication

public class WebApplication{

	public static void main(String[] args) {
		// System.out.println("branch: "+ branchRepository.getTicketAndMoney());
		SpringApplication.run(WebApplication.class, args);
	}
	
	
	

}

