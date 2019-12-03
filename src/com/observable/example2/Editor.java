package com.observable.example2;

import static com.observable.example2.EventManager.sizeByType;

public class Editor {
    private static final String CREDENTIALS = "credentials";
    private static final String PII = "PII";

    public static void main(String[] args) {
        EmailNotificationListener emailNotificationListener = new EmailNotificationListener();
        PasswordNotificationListener passwordNotificationListener = new PasswordNotificationListener();
        NameNotificationListener nameNotificationListener = new NameNotificationListener();
        AgeNotificationListener ageNotificationListener = new AgeNotificationListener();

        EventManager eventManager = new EventManager(CREDENTIALS, PII);
        eventManager.subscribe(CREDENTIALS, emailNotificationListener, passwordNotificationListener);
        eventManager.subscribe(PII, nameNotificationListener, ageNotificationListener);
        eventManager.notifyingAll();
        eventManager.unsubscribe(PII, ageNotificationListener);
        System.out.println("removed " + ageNotificationListener.getClass().getSimpleName());
        eventManager.notifyingAll();
        System.out.println("size of notified " + sizeByType.apply(PII));
        eventManager.notifyingByType(PII);
    }

}
