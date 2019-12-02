package com.observable;

import java.util.function.Supplier;

public class Main {

    private static Supplier<PrivateBank> privateBankSupplier = PrivateBank::new;
    private static Supplier<DoucheBank> doucheBankSupplier = DoucheBank::new;
    private static Supplier<CreditBank> creditBankSupplier = CreditBank::new;
    private static CreditBank creditBank = creditBankSupplier.get();

    public static void main(String[] args) {
        Publisher publisher = new PublisherService();
        publisher.subscribe(creditBank);
        publisher.subscribe(doucheBankSupplier.get());
        publisher.subscribe(privateBankSupplier.get());
        publisher.notifyAllBanks("26.89");
        publisher.unsubscribe(creditBank);
        System.out.println("Remove " + creditBank.getClass().getSimpleName());
        publisher.notifyAllBanks("25.26");
    }
}
