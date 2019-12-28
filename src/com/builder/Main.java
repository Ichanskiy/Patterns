package com.builder;

public class Main {
    public static void main(String[] args) {
        Account account = Account.builder()
                .setId(1)
                .setToken("token")
                .build();
        Person person = new Person.Builder()
                .setFirstName("FN")
                .setLastName("LN")
                .build();
    }

}
