package main.designpatterns.Behavioral.Strategy;

public class StrategyMain {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Airport","Station",TransportationMode.CAR);
    }
}
