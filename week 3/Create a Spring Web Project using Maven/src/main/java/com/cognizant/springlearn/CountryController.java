package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {

    public static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
    @GetMapping("/country")
    public List<Country> getCountryIndia(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Country.xml");
        LOGGER.info("Satarted");
        ArrayList<Country> list=(ArrayList<Country>) context.getBean("list");
        LOGGER.info("Ended");
        return list;

    }
    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code){
        ApplicationContext context=new ClassPathXmlApplicationContext("Country.xml");
        LOGGER.info("Started");
        ArrayList<Country> list=(ArrayList<Country>) context.getBean("list");
        LOGGER.info("End");
        for(Country s:list){
            if(s.getCode().equalsIgnoreCase(code)){
                return s;
            }

        }
        return new Country();
    }
}
