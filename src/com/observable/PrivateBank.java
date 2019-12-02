package com.observable;

public class PrivateBank implements Subscriber {
    @Override
    public void notifying(String value) {
        System.out.println("New PrivateBank currencies :" + value);
    }
}
