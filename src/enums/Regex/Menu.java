package enums.Regex;

import views.*;

import java.util.Scanner;

public enum Menu {
    LoginMenu(new LoginMenu()),
    MainMenu(new MainMenu()),
    ExitMenu(new ExitMenu()),
    GameMenu(new GameMenu()),
    LeaderboardMenu(new LeaderboardMenu()),
    SignupMenu(new SignupMenu());

    private final AppMenu menu;

    Menu(AppMenu menu) {
        this.menu = menu;
    }

    public void checkCommand(Scanner scanner) {
        this.menu.checkInput(scanner);
    }
}
