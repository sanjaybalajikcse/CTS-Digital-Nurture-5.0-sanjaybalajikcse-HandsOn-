package com.cognizant.accountservice.controller;

import com.cognizant.accountservice.client.LoanClient;
import com.cognizant.accountservice.dto.AccountResponse;
import com.cognizant.accountservice.dto.Loan;
import com.cognizant.accountservice.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    private final LoanClient loanClient;

    public AccountController(LoanClient loanClient) {
        this.loanClient = loanClient;
    }

    @GetMapping("/account/{number}")
    public AccountResponse getAccount(@PathVariable String number) {

        Account account = new Account(
                number,
                "Savings",
                5000
        );

        Loan loan = loanClient.getLoan(number);

        return new AccountResponse(account, loan);
    }
}