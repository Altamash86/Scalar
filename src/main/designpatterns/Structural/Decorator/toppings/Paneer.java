package main.designpatterns.Structural.Decorator.toppings;

import main.designpatterns.Structural.Decorator.Pizza;

public class Paneer implements Pizza {

    private Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 60;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + "Paneer + ";
    }
}
