package main.designpatterns.Decorator;

import main.designpatterns.Decorator.base.BBQChicken;
import main.designpatterns.Decorator.toppings.Cheese;
import main.designpatterns.Decorator.toppings.Paneer;
import main.designpatterns.Decorator.toppings.Tomato;

public class DecoratorMain {
    public static void main(String[] args) {
        Pizza p = new Paneer(new Cheese(new Tomato(new BBQChicken())));
        System.out.println(p.getCost());
        System.out.println(p.getDescription());
    }
}
