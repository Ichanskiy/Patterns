package com.decorator;

public class Main {
    public static void main(String[] args) {

        Notifier notifier = new NotifierImpl();
        Notifier facebookNotifier = new FacebookNotifier(notifier);
        Notifier mailNotifier = new MailNotifier(notifier);
        mailNotifier.send("message");
        facebookNotifier.send("message");

    }
}
