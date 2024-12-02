package main.designpatterns.Behavioral.Strategy;

public class GoogleMaps {
    public void findPath(String source, String destination, TransportationMode mode){
        PathFinder pathFinder = PathFinderFactory.getPathFinder(mode);
        pathFinder.pathfinder(source,destination);
    }
}
