package main.designpatterns.Factory;

import main.designpatterns.Factory.Components.Button.AndroidButton;
import main.designpatterns.Factory.Components.Button.Button;
import main.designpatterns.Factory.Components.Dropdown.AndroidDropdown;
import main.designpatterns.Factory.Components.Dropdown.Dropdown;
import main.designpatterns.Factory.Components.Menu.AndroidMenu;
import main.designpatterns.Factory.Components.Menu.Menu;

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
