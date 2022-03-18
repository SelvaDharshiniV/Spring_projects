package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.BloodDonor;
import com.example.demo.service.BloodDonorService;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringJpaApplication.class, args);
		BloodDonor donor=ctx.getBean(BloodDonor.class);
		BloodDonorService service=ctx.getBean(BloodDonorService.class);
//				System.out.println(service.add(donor));
//		System.out.println(ctx.getBean("bloodDonor1"));
		//				service.findAll().forEach(System.out::println);
//		System.out.println(service.findAll());

		//			donor.setDateLastDonated(LocalDate.now());
		//				donor.setBloodGroup("Bpos");
//						service.update(donor);
//						service.delete(donor.getMobileNumber());
		System.out.println(" By BloodGroup");
		service.findByBloodGroup("Apos").forEach(System.out::println);
		System.out.println(" By FirstName");
		service.findByFirstName("Kanic").forEach(System.out::println);
		System.out.println(" By BloodGroup And Date");
		service.srcByGroupAndDate("Apos", LocalDate.of(2021,01,12)).forEach(System.out::println);
		System.out.println("using JPQL");
		service.updateLastDonated( LocalDate.of(2021,01,12),73391);
		service.findAll().forEach(System.out::println);

	}
	@Bean
	public BloodDonor bloodDonor() {
		BloodDonor ram=new BloodDonor();
		ram.setBloodGroup("Apos");
		ram.setFirstName("Ram");
		ram.setMobileNumber(73391);
		ram.setDateLastDonated(LocalDate.of(2021,01,12));
		return ram;
	}
	@Bean
	@Primary
	public BloodDonor bloodDonor1() {
		return new BloodDonor(90801,"Kanic","Opos",LocalDate.of(2021,11,27));
	}


}
