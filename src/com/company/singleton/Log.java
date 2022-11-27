package com.company.singleton;

public class Log {

    private String message = "";
    private static Log log = new Log();

    private Log() {

    }

    public static Log getInstance() {
        return log;
    }

    public void addMessage(String message) {
        this.message += message + " ";
    }

    public void showLog() {
        System.out.println(message);
    }
}
