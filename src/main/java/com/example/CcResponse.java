package com.example;

/**
 * Created by cheng on 2016/7/3 0003.
 */
public class CcResponse {
    private String responseMessage;

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public CcResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
