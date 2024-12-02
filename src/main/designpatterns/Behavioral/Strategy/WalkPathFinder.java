package main.designpatterns.Behavioral.Strategy;

public class WalkPathFinder implements PathFinder{
    @Override
    public void pathfinder(String source, String destination) {
        System.out.println("Walk Path calculated from: "+source+" to: "+destination);
    }
}
