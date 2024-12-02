package main.designpatterns.Behavioral.Strategy;

public class CarPathFinder implements PathFinder{
    @Override
    public void pathfinder(String source, String destination) {
        System.out.println("Car Path calculated from: "+source+" to: "+destination);
    }
}
