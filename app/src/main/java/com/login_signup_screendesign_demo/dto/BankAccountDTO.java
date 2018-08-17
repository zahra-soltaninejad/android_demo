package com.login_signup_screendesign_demo.dto;


import com.login_signup_screendesign_demo.enums.Bank;
import com.login_signup_screendesign_demo.enums.BankAccountType;

import java.math.BigDecimal;
import java.util.Date;

public class BankAccountDTO {

    private String accountNumber;
    private BigDecimal balance;
    private Bank bank;
    private Date creationDate;
    private BankAccountType bankAccountType;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public BankAccountType getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(BankAccountType bankAccountType) {
        this.bankAccountType = bankAccountType;
    }
}
