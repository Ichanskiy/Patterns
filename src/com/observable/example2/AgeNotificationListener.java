package com.observable.example2;

public class AgeNotificationListener implements EventListener {
    @Override
    public void update(String eventType) {
        System.out.println("Updated age by " + eventType);
    }
}
