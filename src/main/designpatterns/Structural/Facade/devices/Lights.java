package main.designpatterns.Structural.Facade.devices;

public class Lights {
    public void on(){
        System.out.println("Sound System is on");
    }

    public void dim(int level){
        System.out.println("Lights are dimmed to level: "+level+"%");
    }
}
