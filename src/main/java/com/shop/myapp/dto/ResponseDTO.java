package com.shop.myapp.dto;

import java.io.Serializable;

public class ResponseDTO implements Serializable {
    private String resultCode;
    private Object res;

    public ResponseDTO(String resultCode, Object res) {
        this.resultCode = resultCode;
        this.res = res;
    }

    public ResponseDTO() {
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public Object getRes() {
        return res;
    }

    public void setRes(Object res) {
        this.res = res;
    }
}
