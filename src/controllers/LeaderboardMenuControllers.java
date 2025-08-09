package controllers;

import enums.Regex.Menu;
import models.App;
import models.Result;
import models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class LeaderboardMenuControllers {

    public Result showCurrentMenu() {
        return new Result(true, "leaderboard menu");
    }

    public void back() {
        App.setCurrentMenu(Menu.MainMenu);
    }

    public Result showRanking() {
        List<User> users = new ArrayList<>(App.user);

        users.sort(
                Comparator
                        .comparingInt(User::getPoint).reversed()
                        .thenComparing(User::getUsername)
        );

        StringBuilder sb = new StringBuilder("Leaderboard:\n");
        for (User u : users) {
            sb.append(u.getUsername())
                    .append(" ")
                    .append(u.getPoint())
                    .append("\n");
        }

        return new Result(true, sb.toString().trim());
    }

    public Result showHistory() {
        return new Result(true, "History:");
    }

    public void exit() {
        App.setCurrentMenu(Menu.ExitMenu);
    }

}

