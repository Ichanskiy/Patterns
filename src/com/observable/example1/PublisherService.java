package com.observable.example1;

class PublisherService extends Publisher {

    @Override
    public void notifyAllBanks(String currencies) {
        super.notifyAllBanks(currencies);
        System.out.println("Finished notifying");
    }

}
