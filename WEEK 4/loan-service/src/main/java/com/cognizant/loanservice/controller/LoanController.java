package com.cognizant.loanservice.controller;

import com.cognizant.loanservice.model.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @GetMapping("/loan/{number}")
    public Loan getLoan(@PathVariable String number){
        return new Loan(
                number,
                "Education",
                5000,
                3285,
                18
        );

    }
}
