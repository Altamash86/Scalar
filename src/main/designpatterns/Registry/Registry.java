package main.designpatterns.Registry;

public interface Registry<T> {
    T clone(int id, char name);
}
