package com.example.demo;

import com.example.demo.model.City;
import com.example.demo.repository.CityRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

//      ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		CityRepository repository = context.getBean(CityRepository.class);
		//CRUD
		//Create
//        repository.save(new City("Minsk"));
//        repository.save(new City("Moscow"));
//        repository.save(new City("Piter"));
//        repository.save(new City("LA"));
		//Read
//		List<City> cities = repository.findAll();
//		System.out.println(cities);
//		System.out.println(repository.findAll());
		//Update
//		System.out.println(repository.findAll());
//		repository.save(new City(4,"Los Angeles"));
//		System.out.println(repository.findAll());
		//Delete
//		System.out.println(repository.findAll());
//		//repository.deleteById(2);
//		repository.delete(new City(4));
//		System.out.println(repository.findAll());
	}
}
