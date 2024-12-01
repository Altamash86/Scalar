package main.designpatterns.Facade;

import main.designpatterns.Facade.devices.DVDPlayer;
import main.designpatterns.Facade.devices.Lights;
import main.designpatterns.Facade.devices.Projector;
import main.designpatterns.Facade.devices.SoundSystem;

public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, Lights lights) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }

    public void watchMovie(String movie){
        System.out.println("Get Ready to Watch Movie: "+movie);
        lights.dim(10);
        projector.on();
        soundSystem.on();
        dvdPlayer.on();
        dvdPlayer.playMovie(movie);
    }

    public void endMovie(){
        System.out.println("Shutting down Movie theater");
        lights.on();
        projector.off();
        soundSystem.off();
        dvdPlayer.off();
    }
}
