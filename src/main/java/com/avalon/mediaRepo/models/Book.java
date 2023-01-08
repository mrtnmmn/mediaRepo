package com.avalon.mediaRepo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {

    @Id
    private String id;

    private String name;

    private String author;

    public Book(String id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
