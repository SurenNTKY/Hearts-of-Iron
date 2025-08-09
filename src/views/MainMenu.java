package views;

import controllers.MainMenuControllers;
import enums.Regex.MainMenuCommands;


import java.util.Scanner;
import java.util.regex.Matcher;

public class MainMenu implements AppMenu {
    private final MainMenuControllers controller = new MainMenuControllers();

    @Override
    public void checkInput(Scanner scanner) {

        String input = scanner.nextLine().trim();
        Matcher matcher;

        if ((matcher = MainMenuCommands.Leaderboard.getMatcher(input)) != null) {
            controller.leaderboard();
        } else if ((matcher = MainMenuCommands.ShowCurrentMenu.getMatcher(input)) != null) {
            System.out.println(controller.showCurrentMenu());
        } else if ((matcher = MainMenuCommands.Play.getMatcher(input)) != null) {
            System.out.println(controller.play(
                    matcher.group("user1"),
                    matcher.group("user2"),
                    matcher.group("user3"),
                    matcher.group("user4")
            ));
        } else if ((matcher = MainMenuCommands.Logout.getMatcher(input)) != null) {
            controller.logout();
        } else if ((matcher = MainMenuCommands.Exit.getMatcher(input)) != null) {
            controller.exit();
        } else {
            System.out.println("invalid command");
        }
    }
}
