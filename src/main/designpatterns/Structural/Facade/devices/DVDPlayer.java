package main.designpatterns.Structural.Facade.devices;

public class DVDPlayer {
    public void on(){
        System.out.println("DVD Player is on");
    }

    public void off(){
        System.out.println("DVD Player is off");
    }

    public void playMovie(String movie){
        System.out.println("Playing Movie: "+movie);
    }
}
