package models;

import enums.Regex.Menu;

import java.util.ArrayList;

public class App {
    public static final ArrayList<User> user = new ArrayList<>();

    public static User currentUser = null;
    private static Menu currentMenu = Menu.SignupMenu;

    public static Menu getCurrentMenu() {
        return currentMenu;
    }

    public static void setCurrentMenu(Menu currentMenu) {
        App.currentMenu = currentMenu;
    }
}
