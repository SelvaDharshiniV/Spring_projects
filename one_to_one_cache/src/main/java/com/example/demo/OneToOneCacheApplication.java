package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Company;
import com.example.demo.entity.Vendor;
import com.example.demo.ifaces.CompanyRepositior;
import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;

@SpringBootApplication
@EnableCaching
@EnableDiscoveryClient
public class OneToOneCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneCacheApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			@Autowired
			private CompanyRepositior repo;
			@Override
			public void run(String... args) throws Exception {
				Vendor vendor=new Vendor(103,"KANIC travels","kk nagar","transport");	
				Company abc=new Company(673223,"ABC Corporation","software",vendor);	
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
