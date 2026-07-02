package com.cognizant.springlearn;

import lombok.Data;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
//import java.util.logging.Logger;

@Data
public class Country {
    public static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
    Country(){
        LOGGER.debug("import org.slf4j.LoggerFactory");
    }
    private String code;
    private String name;
}
