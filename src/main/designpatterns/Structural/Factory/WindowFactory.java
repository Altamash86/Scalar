package main.designpatterns.Structural.Factory;

import main.designpatterns.Structural.Factory.Components.Button.Button;
import main.designpatterns.Structural.Factory.Components.Button.WIndowButton;
import main.designpatterns.Structural.Factory.Components.Dropdown.Dropdown;
import main.designpatterns.Structural.Factory.Components.Dropdown.WindowsDropdown;
import main.designpatterns.Structural.Factory.Components.Menu.Menu;
import main.designpatterns.Structural.Factory.Components.Menu.WindowMenu;

public class WindowFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WIndowButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new WindowsDropdown();
    }
}
