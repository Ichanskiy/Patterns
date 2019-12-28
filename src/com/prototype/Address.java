package com.prototype;

public class Address {

    public String street;
    public Integer number;

    public Address(String street, Integer number) {
        this.street = street;
        this.number = number;
    }

    public Address(Address that) {
        if (that != null) {
            this.street = that.street;
            this.number = that.number;
        }
    }

}
