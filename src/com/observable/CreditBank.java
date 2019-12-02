package com.observable;

public class CreditBank implements Subscriber {
    @Override
    public void notifying(String value) {
        System.out.println("New CreditBank currencies :" + value);
    }
}
