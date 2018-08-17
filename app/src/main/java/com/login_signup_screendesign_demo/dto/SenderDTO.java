package com.login_signup_screendesign_demo.dto;


import com.login_signup_screendesign_demo.enums.Gender;

import java.util.Date;

public class SenderDTO {

    private String sId;
    private String firstName;
    private String lastName;
    private String nationalCode;
    private String email;
    private String phoneNumber;
    private Gender gender;
    private String fathersName;
    private Date birthDate;
    private SenderAccountDTO senderAccount;
    private SignDTO sign;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
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

    public SenderAccountDTO getSenderAccount() {
        return senderAccount;
    }

    public void setSenderAccount(SenderAccountDTO senderAccount) {
        this.senderAccount = senderAccount;
    }

    public SignDTO getSign() {
        return sign;
    }

    public void setSign(SignDTO sign) {
        this.sign = sign;
    }
}
