package main.designpatterns.Structural.Decorator.base;

import main.designpatterns.Structural.Decorator.Pizza;

public class Pepperoni implements Pizza {

    public Pepperoni() {
    }

    @Override
    public int getCost() {
        return 180;
    }

    @Override
    public String getDescription() {
        return "Pepperoni + ";
    }
}
