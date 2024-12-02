package main.designpatterns.Creational.Registry;

public interface Registry<T> {
    T clone(int id, char name);
}
