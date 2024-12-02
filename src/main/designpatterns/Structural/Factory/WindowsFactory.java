package main.designpatterns.Structural.Factory;

import main.designpatterns.Structural.Factory.Components.Button.Button;
import main.designpatterns.Structural.Factory.Components.Dropdown.Dropdown;
import main.designpatterns.Structural.Factory.Components.Menu.Menu;

public class WindowsFactory implements UIFactory{
    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public Dropdown createDropdown() {
        return null;
    }
}
