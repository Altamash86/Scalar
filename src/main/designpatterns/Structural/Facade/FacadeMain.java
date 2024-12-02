package main.designpatterns.Structural.Facade;

import main.designpatterns.Structural.Facade.devices.DVDPlayer;
import main.designpatterns.Structural.Facade.devices.Lights;
import main.designpatterns.Structural.Facade.devices.Projector;
import main.designpatterns.Structural.Facade.devices.SoundSystem;

public class FacadeMain {
    public static void main(String[] args) {

        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer,projector,soundSystem,lights);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
