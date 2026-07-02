package com.cognizant.country_code.service;

import com.cognizant.country_code.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.country_code.model.Country;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;



    public List<Country> getCountry() {
        return countryRepository.findAll();
    }

    public String addCountry(Country country) {
        countryRepository.save(country);
        return "added...";
    }

    public Country getCountryById(int id) {
        return countryRepository.findById(id).orElse(new Country());
    }
    public  String updateCountry(Country country) {
        countryRepository.save(country);
        return "Updated Successfully";
    }

    public String deleteCountry(int id) {
        countryRepository.deleteById(id);
        return "Deleted Successfully";
    }
}
