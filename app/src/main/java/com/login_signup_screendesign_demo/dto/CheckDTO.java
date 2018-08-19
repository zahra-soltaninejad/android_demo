package com.login_signup_screendesign_demo.dto;


import java.math.BigDecimal;
import java.util.Date;

public class CheckDTO {

    private String rId;
    private String serialNumber;
    private Date date;
    private Date vosolDate;
    private boolean isRAccepted;
    private boolean isSAccepted;
    private boolean isPassedYet;
    private boolean hasLabel;
    private int editedTime;
    private String comment;
    private BigDecimal amount;

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getVosolDate() {
        return vosolDate;
    }

    public void setVosolDate(Date vosolDate) {
        this.vosolDate = vosolDate;
    }

    public boolean isRAccepted() {
        return isRAccepted;
    }

    public void setRAccepted(boolean RAccepted) {
        isRAccepted = RAccepted;
    }

    public boolean isSAccepted() {
        return isSAccepted;
    }

    public void setSAccepted(boolean SAccepted) {
        isSAccepted = SAccepted;
    }

    public boolean isPassedYet() {
        return isPassedYet;
    }

    public void setPassedYet(boolean passedYet) {
        isPassedYet = passedYet;
    }

    public boolean isHasLabel() {
        return hasLabel;
    }

    public void setHasLabel(boolean hasLabel) {
        this.hasLabel = hasLabel;
    }

    public int getEditedTime() {
        return editedTime;
    }

    public void setEditedTime(int editedTime) {
        this.editedTime = editedTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}

