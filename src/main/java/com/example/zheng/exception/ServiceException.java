package com.example.zheng.exception;

/**
 * @author shkstart
 * @create 2022-11-11 14:37
 */
public class ServiceException extends RuntimeException {

    private String code;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);

    }

    public ServiceException(String code, String message){
        super(message);
    }
}
