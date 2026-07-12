package com.cognizant.accountservice.client;

import com.cognizant.accountservice.dto.Loan;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "LOAN-SERVICE")
public interface LoanClient {

    @GetMapping("/loan/{number}")
    Loan getLoan(@PathVariable String number);

}