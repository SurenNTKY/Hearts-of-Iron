package views;

import controllers.LoginMenuControllers;
import enums.Regex.LoginMenuCommands;
import enums.Regex.SignupMenuCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class LoginMenu implements AppMenu {
    private final LoginMenuControllers controller = new LoginMenuControllers();

    @Override
    public void checkInput(Scanner scanner) {

        String input = scanner.nextLine().trim();
        Matcher matcher;

        if ((matcher = LoginMenuCommands.Login.getMatcher(input)) != null) {
            System.out.println(controller.login(
                    matcher.group("username"),
                    matcher.group("password")
            ).toString());
        } else if ((matcher = LoginMenuCommands.ForgetPassword.getMatcher(input)) != null) {
            System.out.println(controller.forgotPassword(
                    matcher.group("username"),
                    matcher.group("email")
            ).toString());
        } else if ((matcher = SignupMenuCommands.ShowCurrentMenu.getMatcher(input)) != null) {
            System.out.println(controller.showCurrentMenu());
        } else if ((matcher = LoginMenuCommands.Back.getMatcher(input)) != null) {
            controller.back();
        } else if ((matcher = LoginMenuCommands.Exit.getMatcher(input)) != null) {
            controller.exit();
        } else {
            System.out.println("invalid command");
        }


    }
}
