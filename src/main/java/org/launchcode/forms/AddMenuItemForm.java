package org.launchcode.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

import javax.validation.constraints.NotNull;

public class AddMenuItemForm {
    @NotNull
    private int MenuId;

    @NotNull
    private int CheeseId;

    private Iterable<Cheese> cheeses;

    private Menu menu;

    public AddMenuItemForm() {}

    public AddMenuItemForm(Iterable<Cheese> cheeses, Menu menu){
        this.cheeses = cheeses;
        this.menu = menu;
    }
    public int getMenuId() {
        return MenuId;
    }

    public void setMenuId(int menuId) {
        MenuId = menuId;
    }

    public int getCheeseId() {
        return CheeseId;
    }

    public void setCheeseId(int cheeseId) {
        CheeseId = cheeseId;
    }

    public Iterable<Cheese> getCheeses() {
        return cheeses;
    }

    public Menu getMenu() {
        return menu;
    }
}
