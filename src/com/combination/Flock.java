package com.combination;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {

    private List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quackable){
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable next = iterator.next();
            next.quack();
        }
    }
}
