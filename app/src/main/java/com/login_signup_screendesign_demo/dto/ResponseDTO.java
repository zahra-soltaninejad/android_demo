package com.login_signup_screendesign_demo.dto;


import com.login_signup_screendesign_demo.enums.ResponseStatus;

/**
 * @author m.pak
 * @since 8/7/2018
 */
public class ResponseDTO<T> {

    private ResponseStatus status;
    private T responseObject;
    private String message;

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public T getResponseObject() {
        return responseObject;
    }

    public void setResponseObject(T responseObject) {
        this.responseObject = responseObject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}