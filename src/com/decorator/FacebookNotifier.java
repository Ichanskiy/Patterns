package com.decorator;

public class FacebookNotifier implements NotifierDecorator {

    private Notifier notifier;

    public FacebookNotifier(Notifier notifier) {
        setNotifier(notifier);
    }

    @Override
    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
        System.out.println("Facebook : " + message);
    }
}
