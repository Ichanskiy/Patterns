package com.observable.example2;

public class NameNotificationListener implements EventListener {
    @Override
    public void update(String eventType) {
        System.out.println("Updated name by " + eventType);
    }
}
