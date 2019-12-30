package com.decorator;

public class MailNotifier implements NotifierDecorator {

    private Notifier notifier;

    public MailNotifier(Notifier notifier) {
        setNotifier(notifier);
    }

    @Override
    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
        System.out.println("Gmail : " + message);
    }
}
