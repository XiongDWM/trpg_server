package com.xiong.trpg.utils;

public enum ResultStatus {
    SUCCESS(200,"ok"),
    BAD_REQUEST(555,"no such data"),
    INTERNAL_SERVER_ERROR(500,"param fault"),
    REGISTER_FAIL(201,"exists");
    private Integer code;
    private String msg;

    ResultStatus(int code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "ResultStatus{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
