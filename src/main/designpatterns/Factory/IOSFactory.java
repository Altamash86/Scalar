package main.designpatterns.Factory;

import main.designpatterns.Factory.Components.Button.Button;
import main.designpatterns.Factory.Components.Button.IOSButton;
import main.designpatterns.Factory.Components.Dropdown.Dropdown;
import main.designpatterns.Factory.Components.Dropdown.IOSDropdown;
import main.designpatterns.Factory.Components.Menu.IOSMenu;
import main.designpatterns.Factory.Components.Menu.Menu;

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
