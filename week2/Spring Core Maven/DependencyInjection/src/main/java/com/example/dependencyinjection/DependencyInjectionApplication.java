package com.example.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dependencyinjection.service.BookService;

public class DependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService =
                context.getBean("bookService", BookService.class);

        bookService.displayBook();
    }
}