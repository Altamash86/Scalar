package main.designpatterns.Decorator.toppings;

import main.designpatterns.Decorator.Pizza;

public class Cheese implements Pizza {

    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 80;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + "Cheese + ";
    }
}
