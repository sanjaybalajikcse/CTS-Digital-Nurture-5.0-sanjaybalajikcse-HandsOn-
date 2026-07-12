package com.cognizant.accountservice.dto;

import com.cognizant.accountservice.model.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponse {

    private Account account;
    private Loan loan;

}