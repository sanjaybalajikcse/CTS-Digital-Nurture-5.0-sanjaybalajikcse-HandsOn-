package com.cognizant.country_code.repository;

import com.cognizant.country_code.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Integer> {
}
