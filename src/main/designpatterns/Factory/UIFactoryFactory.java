package main.designpatterns.Factory;

public class UIFactoryFactory {

    public static UIFactory getUIFactory(SupportedPlateforms plateforms){
        return switch (plateforms){
            case ANDROID -> new AndroidFactory();
            case IOS -> new IOSFactory();
            case WINDOWS -> new WindowFactory();
        };
    }
}
/*
    UIFactory -> creates object of UI elements, Menu, DropDown, Button etc.
    UIFactoryFactory -> creating objects of UIFactory, AndroidFactory/IOSFactory
 */