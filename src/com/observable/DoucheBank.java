package com.observable;

public class DoucheBank implements Subscriber {
    @Override
    public void notifying(String value) {
        System.out.println("New DoucheBank currencies :" + value);
    }
}
