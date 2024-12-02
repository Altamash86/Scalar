package main.designpatterns.Structural.Decorator.base;

import main.designpatterns.Structural.Decorator.Pizza;

public class Margherita implements Pizza {

    public Margherita() {
    }

    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "Margherita + ";
    }
}
