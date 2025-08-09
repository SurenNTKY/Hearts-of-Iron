package views;

import enums.Regex.Menu;
import models.App;
import java.util.Scanner;

public class AppView {
    public void runProgram() {
        try(Scanner scanner = new Scanner(System.in)) {
            while(App.getCurrentMenu() != Menu.ExitMenu) {
                App.getCurrentMenu().checkCommand(scanner);
            }
        }
    }
}
