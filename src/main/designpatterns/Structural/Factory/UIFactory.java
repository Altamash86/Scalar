package main.designpatterns.Structural.Factory;

import main.designpatterns.Structural.Factory.Components.Button.Button;
import main.designpatterns.Structural.Factory.Components.Dropdown.Dropdown;
import main.designpatterns.Structural.Factory.Components.Menu.Menu;

public interface UIFactory {

    Button createButton();

    Menu createMenu();

    Dropdown createDropdown();
}
