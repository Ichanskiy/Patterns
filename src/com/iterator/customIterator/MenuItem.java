package com.iterator.customIterator;

public class MenuItem {
    private String name;
    private boolean vegetarian;
    private double cost;

    public MenuItem(String name, boolean vegetarian, double cost) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", vegetarian=" + vegetarian +
                ", cost=" + cost +
                '}';
    }
}
