package com.avalon.mediaRepo.repositories;

import com.avalon.mediaRepo.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookRepository {

    @Autowired
    private IBookRepository iBookRepository;

    public Book addBook(Book book) {
        return iBookRepository.save(book);
    }

    public List<Book> findAll() {
        iBookRepository.findAll().forEach(item -> System.out.println(item));
        return iBookRepository.findAll();
    }

}
