package com.adapter;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("gobble WildTurkey");
    }

    @Override
    public void fly() {
        System.out.println("fly WildTurkey");
    }
}
