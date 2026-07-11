package com.example.dependencyinjection.service;

import com.example.dependencyinjection.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        System.out.println("Book Title: " + bookRepository.getBookTitle());
    }
}