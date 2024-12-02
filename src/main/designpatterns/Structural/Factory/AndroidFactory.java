package main.designpatterns.Structural.Factory;

import main.designpatterns.Structural.Factory.Components.Button.AndroidButton;
import main.designpatterns.Structural.Factory.Components.Button.Button;
import main.designpatterns.Structural.Factory.Components.Dropdown.AndroidDropdown;
import main.designpatterns.Structural.Factory.Components.Dropdown.Dropdown;
import main.designpatterns.Structural.Factory.Components.Menu.AndroidMenu;
import main.designpatterns.Structural.Factory.Components.Menu.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
