package com.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("street", 10);

        LandUser landUser = new LandUser();
        landUser.age = 20;
        landUser.name = "Jack";
        landUser.address = address;
        LandUser clone = (LandUser) landUser.clone();

        System.out.println(clone.age);
        System.out.println(clone.name);
        System.out.println(clone.address.number);
        System.out.println(clone.address.street);
        address.number = 33;

        System.out.println(clone.address.number + " != " + landUser.address.number);

        LandUser clone2 = new LandUser(landUser);
        System.out.println(clone2.age);
        System.out.println(clone2.name);
        System.out.println(clone2.address.number);
        System.out.println(clone2.address.street);
    }

}
