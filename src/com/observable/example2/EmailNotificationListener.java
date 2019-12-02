package com.observable.example2;

public class EmailNotificationListener implements EventListener {
    @Override
    public void update(String eventType) {
        System.out.println("Updated email by " + eventType);
    }
}
