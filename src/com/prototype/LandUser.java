package com.prototype;

public class LandUser extends User {

    public Address address;
    private String type = "LAND";

    public LandUser() {
    }

    public LandUser(LandUser that) {
        super(that);
        if (that != null) {
            this.address = new Address(that.address);
        }
    }

    @Override
    public User clone() {
        return new LandUser(this);
    }
}
