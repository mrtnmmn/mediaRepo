package com.avalon.mediaRepo.repositories;

import com.avalon.mediaRepo.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IBookRepository extends MongoRepository<Book, String> {
}
