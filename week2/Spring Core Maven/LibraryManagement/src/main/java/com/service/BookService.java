package com.service;

import com.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    BookService(BookRepository bookRepository){
        System.out.println("This is book serrvice constructor");
        this.bookRepository=bookRepository;
    }
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public BookRepository getBookRepository(){
        return bookRepository;
    }
}
