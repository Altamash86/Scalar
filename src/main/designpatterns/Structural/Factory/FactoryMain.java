package main.designpatterns.Structural.Factory;

import main.designpatterns.Structural.Factory.Components.Button.Button;
import main.designpatterns.Structural.Factory.Components.Dropdown.Dropdown;
import main.designpatterns.Structural.Factory.Components.Menu.Menu;


public class FactoryMain {
    public static void main(String[] args) {
        UIFactory uiFactory = UIFactoryFactory.getUIFactory(SupportedPlateforms.IOS);
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        Dropdown dropdown = uiFactory.createDropdown();
    }
}
