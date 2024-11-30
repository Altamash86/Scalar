package main.designpatterns.Factory;

import main.designpatterns.Factory.Components.Button.Button;
import main.designpatterns.Factory.Components.Button.WIndowButton;
import main.designpatterns.Factory.Components.Dropdown.Dropdown;
import main.designpatterns.Factory.Components.Dropdown.WindowsDropdown;
import main.designpatterns.Factory.Components.Menu.Menu;
import main.designpatterns.Factory.Components.Menu.WindowMenu;

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
