package main.designpatterns.Behavioral.Strategy;

public class BusPathFinder implements PathFinder{
    @Override
    public void pathfinder(String source, String destination) {
        System.out.println("Bus Path calculated from: "+source+" to: "+destination);
    }
}
