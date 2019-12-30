package com.decorator;

public class NotifierImpl implements Notifier {
    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
