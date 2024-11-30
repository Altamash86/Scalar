package main.designpatterns.Factory;

import main.designpatterns.Factory.Components.Button.Button;
import main.designpatterns.Factory.Components.Dropdown.Dropdown;
import main.designpatterns.Factory.Components.Menu.Menu;

public interface UIFactory {

    Button createButton();

    Menu createMenu();

    Dropdown createDropdown();
}
