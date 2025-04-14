package com.devops;

public class MsgBld {

    public String getMessage(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Please provide a name!";
        } else {
            return "Hello " + name;
        }
    }
}
