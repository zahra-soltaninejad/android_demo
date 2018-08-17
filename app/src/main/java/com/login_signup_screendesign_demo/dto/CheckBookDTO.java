package com.login_signup_screendesign_demo.dto;


import com.login_signup_screendesign_demo.enums.CheckType;

import java.util.Date;
import java.util.List;

public class CheckBookDTO {

    private String checkBookId;
    private List<CheckDTO> checkS;
    private int pageCount;
    private Date expiredDate;
    private Date creationDate;
    private CheckType checkType;


    public String getCheckBookId() {
        return checkBookId;
    }

    public void setCheckBookId(String checkBookId) {
        this.checkBookId = checkBookId;
    }

    public List<CheckDTO> getCheckS() {
        return checkS;
    }

    public void setCheckS(List<CheckDTO> checkS) {
        this.checkS = checkS;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public CheckType getCheckType() {
        return checkType;
    }

    public void setCheckType(CheckType checkType) {
        this.checkType = checkType;
    }
}
