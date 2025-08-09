package views;

import controllers.LeaderboardMenuControllers;
import enums.Regex.LeaderboardMenuCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class LeaderboardMenu implements AppMenu {
    private final LeaderboardMenuControllers controllers = new LeaderboardMenuControllers();

    @Override
    public void checkInput(Scanner scanner) {

        String input = scanner.nextLine();
        Matcher matcher;

        if ((matcher = LeaderboardMenuCommands.ShowCurrentMenu.getMatcher(input)) != null) {
            System.out.println(controllers.showCurrentMenu());
        } else if ((matcher = LeaderboardMenuCommands.Back.getMatcher(input)) != null) {
            controllers.back();
        } else if ((matcher = LeaderboardMenuCommands.ShowRanking.getMatcher(input)) != null){
            System.out.println(controllers.showRanking());
        } else if ((matcher = LeaderboardMenuCommands.ShowHistory.getMatcher(input)) != null){
            System.out.println(controllers.showHistory());
        } else if ((matcher = LeaderboardMenuCommands.Exit.getMatcher(input)) != null){
            controllers.exit();
        }  else {
            System.out.println("invalid command");
        }
    }
}
