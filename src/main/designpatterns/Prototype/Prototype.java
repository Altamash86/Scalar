package main.designpatterns.Prototype;

public interface Prototype<T> {
    T clone(int id, char name);
}
