package com.cognizant.springlearn;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
@SpringBootApplication
public class SpringLearnApplication {
    public static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) throws ParseException {
        SpringApplication.run(SpringLearnApplication.class, args);
        System.out.println("This is sprintboot project");

        displayCountry();

    }
    public static void displayCountry(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Country.xml");
        Country obj= context.getBean("country", Country.class);

        LOGGER.info("Getting the country info");
        System.out.println(obj.getCode());
        System.out.println(obj.getName());
        LOGGER.info("This is end message");
        LOGGER.debug("Country:{} {} ",obj.getCode(),obj.getName());


    }

//    public static void displayDate() throws ParseException {
//
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("date-format.xml");
//
//        SimpleDateFormat format =
//                (SimpleDateFormat) context.getBean("dateFormat");
//
//        Date date = format.parse("01/07/2026");
//
//        System.out.println(date);
//    }

}
