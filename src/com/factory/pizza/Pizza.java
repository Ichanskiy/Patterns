package com.factory.pizza;

public abstract class Pizza {

    private String type = "Pattern";
    Integer size;


    public void cut(){
        System.out.println("cutting");
    }

    public void box(){
        System.out.println("boxing");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}
