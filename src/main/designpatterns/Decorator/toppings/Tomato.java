package main.designpatterns.Decorator.toppings;

import main.designpatterns.Decorator.Pizza;

public class Tomato implements Pizza {

    private Pizza pizza;

    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + "Tomato + ";
    }
}
