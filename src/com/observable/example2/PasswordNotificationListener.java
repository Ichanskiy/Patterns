package com.observable.example2;

public class PasswordNotificationListener implements EventListener {
    @Override
    public void update(String eventType) {
        System.out.println("Updated password by " + eventType);
    }
}
