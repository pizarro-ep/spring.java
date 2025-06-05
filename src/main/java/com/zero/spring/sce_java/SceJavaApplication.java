package com.zero.spring.sce_java;

//import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.zero.spring.sce_java.entities.PersonEntity;
//import com.zero.spring.sce_java.interceptors.PersonRepository;

@SpringBootApplication

public class SceJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SceJavaApplication.class, args);
	}

}

/*
 * public class SceJavaApplication implements CommandLineRunner {
 * 
 * @Autowired
 * private PersonRepository repository;
 * 
 * public static void main(String[] args) {
 * SpringApplication.run(SceJavaApplication.class, args);
 * }
 * 
 * @Override
 * public void run(String... args) throws Exception {
 * List<PersonEntity> list = (List<PersonEntity>) repository.findAll();
 * list.stream().forEach(p -> System.out.println(p.toString()));
 * }
 * 
 * }
 */
