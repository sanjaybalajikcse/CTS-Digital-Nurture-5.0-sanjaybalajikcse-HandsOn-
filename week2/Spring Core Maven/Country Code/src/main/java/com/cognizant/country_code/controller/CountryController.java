package com.cognizant.country_code.controller;
import com.cognizant.country_code.model.Country;
import com.cognizant.country_code.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {
    @Autowired
    CountryService countryService;
    @GetMapping("/country")
    public List<Country> getCountry(){
        return countryService.getCountry();
    }
    @PostMapping("/country")
    public String addCountry(@RequestBody Country country){
        return countryService.addCountry(country);

    }
    @GetMapping("/country/{id}")
    public Country getCountryById(@PathVariable int id){
        return countryService.getCountryById(id);
    }
    @PutMapping("/country")
    public String updateCountry(@RequestBody Country country){
        return countryService.updateCountry(country);
    }
    @DeleteMapping("/country/{id}")
    public String deleteCountry(@PathVariable int id){
        return countryService.deleteCountry(id);
    }
}
