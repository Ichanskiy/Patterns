package com.observable.example1;

import java.util.ArrayList;
import java.util.List;

abstract class Publisher {
    private List<Subscriber> allBanks = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        allBanks.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        allBanks.remove(subscriber);
    }

    public void notifyAllBanks(String currencies) {
        for (Subscriber bank : allBanks) {
            bank.notifying(currencies);
        }
    }
}
