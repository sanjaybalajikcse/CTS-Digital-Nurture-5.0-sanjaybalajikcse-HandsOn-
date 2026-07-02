package com;

import com.repository.BookService;
import com.service.BookRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        BookService bookService=(BookService) context.getBean("bookService");
        BookRepository bookRepository=(BookRepository) context.getBean("bookRepository");
        bookService.print();
        bookRepository.print();
        System.out.println(bookService.getBook());

    }
}