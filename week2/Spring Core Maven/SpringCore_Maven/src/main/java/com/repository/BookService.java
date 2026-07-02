package com.repository;

import com.service.BookRepository;

public class BookService {
    BookRepository book;
    public void setBook(BookRepository book){
        this.book=book;
    }
    public BookRepository getBook(){
        return book;
    }
    public void print(){
        System.out.println("This is BookService class");
    }

}
