package com.library.librarymanagement.service;

import com.library.librarymanagement.entity.Book;
import com.library.librarymanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public Book saveBook(Book book) {
        return repository.save(book);
    }

    public List<Book> getBooks() {
        return repository.findAll();
    }

}