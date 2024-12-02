package main.designpatterns.Structural.Decorator;

import main.designpatterns.Structural.Decorator.base.BBQChicken;
import main.designpatterns.Structural.Decorator.toppings.Cheese;
import main.designpatterns.Structural.Decorator.toppings.Paneer;
import main.designpatterns.Structural.Decorator.toppings.Tomato;

public class DecoratorMain {
    public static void main(String[] args) {
        Pizza p = new Paneer(new Cheese(new Tomato(new BBQChicken())));
        System.out.println(p.getCost());
        System.out.println(p.getDescription());
    }
}
/*
Please create a class diagram and code to represent a Pizza with the following set of requirements.
    1.Every pizza has a name and a description.
    2.We need to get the cost and description of constituents of the pizza.
    3.There are 4 base pizzas on which toppings can be added later, if needed by the customer. These pizzas, along with their costs, are:
        a.Farmhouse - Rs. 150
        b.Margherita - Rs. 200
        c.Pepperoni - Rs. 180
        d.BBQChicken - Rs. 200
    4.There are 4 types of toppings that are supported. A customer may want to add any quantity of them (Eg: They may want to add Olives twice). The toppings, along with their costs, are:
        a.Olive - Rs. 20
        b.Tomato - Rs. 30
        c.Cheese - Rs. 80
        d.Paneer - Rs. 60

Your class diagram, when implemented, should be able to successfully compile and run for following code:

Pizza p = new Paneer(new Cheese(new Tomato(new BBQChicken())));
System.out.printLn(p.getCost()); // should output 370
System.out.printLn(p.getDescription()); // should output BBChicken + Tomato + Cheese + Paneer

*/
