package main.designpatterns.Factory;

import main.designpatterns.Factory.Components.Button.Button;
import main.designpatterns.Factory.Components.Dropdown.Dropdown;
import main.designpatterns.Factory.Components.Menu.Menu;


public class FactoryMain {
    public static void main(String[] args) {
        UIFactory uiFactory = UIFactoryFactory.getUIFactory(SupportedPlateforms.IOS);
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        Dropdown dropdown = uiFactory.createDropdown();
    }
}
