package main.designpatterns.Structural.Decorator.base;

import main.designpatterns.Structural.Decorator.Pizza;

public class Farmhouse implements Pizza {

    public Farmhouse() {
    }

    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "Farmhouse + ";
    }
}
