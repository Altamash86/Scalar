package main.designpatterns.Creational.Prototype;

public interface Prototype<T> {
    T clone(int id, char name);
}
