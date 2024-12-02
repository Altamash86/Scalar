package main.designpatterns.Behavioral.Strategy;


public class PathFinderFactory {
    public static PathFinder getPathFinder(TransportationMode transportationMode){
        return switch (transportationMode){
            case CAR -> new CarPathFinder();
            case WALK -> new WalkPathFinder();
            case BUS -> new BusPathFinder();
        };
    }
}
