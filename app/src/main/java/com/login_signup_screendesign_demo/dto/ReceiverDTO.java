package com.login_signup_screendesign_demo.dto;

import com.login_signup_screendesign_demo.enums.Gender;

import java.util.Date;

public class ReceiverDTO {

    private String rId;
    private String firstName;
    private String lastName;
    private String nationalCode;
    private String email;
    private String phoneNumber;
    private Gender gender;
    private String fathersName;
    private Date birthDate;
    private ReceiverAccountDTO receiverAccount;

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public ReceiverAccountDTO getReceiverAccount() {
        return receiverAccount;
    }

    public void setReceiverAccount(ReceiverAccountDTO receiverAccount) {
        this.receiverAccount = receiverAccount;
    }
}
