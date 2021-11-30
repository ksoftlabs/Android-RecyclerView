package com.ksoftlabs.recyclerview;

public class ModelClass {
    private String username;
    private String time;
    private String message;

    ModelClass(String username,String time,String message){
        this.username=username;
        this.time=time;
        this.message=message;
    }

    public String getUsername() {
        return username;
    }

    public String getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }
}
