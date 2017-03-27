package com.sam.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sam.db.domain.City;
import com.sam.db.domain.Country;
import com.sam.db.repo.CountryRepository;




@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.sam.db","com.sam.repo"})
public class main {
	
	public static void main(String[] args) throws Exception{
        SpringApplication.run(main.class, args);
    }
	
	@Bean
	public CommandLineRunner demo(CountryRepository repository) {
		return (args) -> {
			Country cont = new Country(23,"Ind",43434);
			City ct = new City("pune");
			City ct2 = new City("mumbai");
			 List <City> cities = new ArrayList<City>();
			 cities.add(ct); cities.add(ct2);
			 cont.setCities(cities);
		 	repository.save(cont);
			for (Country country : repository.findAll()) {
				System.out.println(country.toString());
			}
			
		};
		
}
	
}
