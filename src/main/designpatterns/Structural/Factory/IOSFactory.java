package main.designpatterns.Structural.Factory;

import main.designpatterns.Structural.Factory.Components.Button.Button;
import main.designpatterns.Structural.Factory.Components.Button.IOSButton;
import main.designpatterns.Structural.Factory.Components.Dropdown.Dropdown;
import main.designpatterns.Structural.Factory.Components.Dropdown.IOSDropdown;
import main.designpatterns.Structural.Factory.Components.Menu.IOSMenu;
import main.designpatterns.Structural.Factory.Components.Menu.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
