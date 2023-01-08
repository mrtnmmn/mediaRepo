package com.avalon.mediaRepo.controllers;

import com.avalon.mediaRepo.commons.CommonUtils;
import com.avalon.mediaRepo.models.Book;
import com.avalon.mediaRepo.repositories.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/book")
@CrossOrigin(origins = "http://localhost:3000")
public class BookController {

    @Autowired
    IBookRepository bookRepository;

    @GetMapping("/")
    public List<Book> findAll() {
        System.out.println("Retrieving all books: ");
        List<Book> allBooks = bookRepository.findAll("Books");
        allBooks.add(new Book("222", "ndanfndan", "aidnsadf"));
        CommonUtils.soutEntireList(allBooks);
        return allBooks;
    }

    @GetMapping("/test")
    public Book testBook() {
        System.out.println("Retrieving test book mock: ");
        return new Book("1", "Test", "Book");
    }
}