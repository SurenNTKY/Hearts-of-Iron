package views;

import controllers.SignupMenuControllers;
import enums.Regex.SignupMenuCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class SignupMenu implements AppMenu {
    private final SignupMenuControllers controller = new SignupMenuControllers();

    @Override
    public void checkInput(Scanner scanner) {

        String input = scanner.nextLine().trim();
        Matcher matcher;

        if ((matcher = SignupMenuCommands.Register.getMatcher(input)) != null) {
            System.out.println(controller.register(
                    matcher.group("username"),
                    matcher.group("password"),
                    matcher.group("email")
            ));
        } else if ((matcher = SignupMenuCommands.Login.getMatcher(input)) != null) {
            controller.login();
        } else if ((matcher = SignupMenuCommands.ShowCurrentMenu.getMatcher(input)) != null) {
            System.out.println(controller.showCurrentMenu());
        } else if ((matcher = SignupMenuCommands.Exit.getMatcher(input)) != null) {
            controller.exit();
        } else {
            System.out.println("invalid command");
        }
    }
}
