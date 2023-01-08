package com.avalon.mediaRepo;

import com.avalon.mediaRepo.repositories.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MediaRepoApplication {

	@Autowired
	IBookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(MediaRepoApplication.class, args);
	}

}
