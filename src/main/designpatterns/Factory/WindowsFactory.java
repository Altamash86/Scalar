package main.designpatterns.Factory;

import main.designpatterns.Factory.Components.Button.Button;
import main.designpatterns.Factory.Components.Dropdown.Dropdown;
import main.designpatterns.Factory.Components.Menu.Menu;

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
