package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.DrivingLicence;
import com.example.demo.entity.Employee;
import com.example.demo.ifaces.EmployeeRepository;
import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;

@SpringBootApplication
@EnableCaching
public class OneToOneExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneExerciseApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			@Autowired
			private EmployeeRepository repo;
			@Override
			public void run(String... args) throws Exception {
				DrivingLicence drivingLicence=new DrivingLicence(3435465,LocalDate.now(),"Kumar");	
				Employee abc=new Employee(673223,"ABC Corporation",drivingLicence);	
				this.repo.save(abc);
			}
		};
	}
	@Bean
	public Config hazConfig() {
		return new Config().setInstanceName("one-one mapping")
				.addMapConfig(new MapConfig().setName("compcashe"));
	}
}
