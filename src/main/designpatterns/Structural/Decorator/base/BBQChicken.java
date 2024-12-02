package main.designpatterns.Structural.Decorator.base;

import main.designpatterns.Structural.Decorator.Pizza;

public class BBQChicken implements Pizza {

    public BBQChicken() {
    }

    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "BBQChicken + ";
    }
}
