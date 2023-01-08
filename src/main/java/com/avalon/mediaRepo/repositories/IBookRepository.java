package com.avalon.mediaRepo.repositories;

import com.avalon.mediaRepo.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface IBookRepository extends MongoRepository<Book, String> {

    @Query("{name:'?0'}")
    Book findItemByName(String name);

    @Query(value="{name:'?0'}", fields="{'name' : 1, 'author' : 1}")
    List<Book> findAll(String category);

    public long count();

}
