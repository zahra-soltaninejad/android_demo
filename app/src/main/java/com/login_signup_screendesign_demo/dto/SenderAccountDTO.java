package com.login_signup_screendesign_demo.dto;


public class SenderAccountDTO {

    private BankAccountDTO bankAccount;
    private CheckBookDTO checkBook;


    public BankAccountDTO getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccountDTO bankAccount) {
        this.bankAccount = bankAccount;
    }

    public CheckBookDTO getCheckBook() {
        return checkBook;
    }

    public void setCheckBook(CheckBookDTO checkBook) {
        this.checkBook = checkBook;
    }
}
