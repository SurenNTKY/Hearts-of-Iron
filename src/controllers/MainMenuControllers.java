package controllers;

import enums.Regex.Menu;
import models.App;
import models.Result;
import models.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainMenuControllers {

    public void leaderboard(){
        App.setCurrentMenu(Menu.LeaderboardMenu);
    }

    public Result showCurrentMenu() {
        return new Result(true, "main menu");
    }

    public Result play(String user1, String user2, String user3, String user4) {
        List<String> sel = new ArrayList<>();
        for (String u : List.of(user1, user2, user3, user4))
            if (u != null && !u.isBlank()) sel.add(u.trim());
        if (new HashSet<>(sel).size() < sel.size())
            return new Result(false, "users must be distinct");
        String me = App.currentUser.getUsername();
        if (sel.contains(me))
            return new Result(false, "you can't choose urself");
        Set<String> avail = App.user.stream()
                .map(User::getUsername)
                .collect(Collectors.toSet());
        for (String u : sel)
            if (!avail.contains(u))
                return new Result(false, "select between available users");
        List<String> players = new ArrayList<>();
        players.add(me);
        players.addAll(sel);
        for (int i = 1; players.size() < 5; i++)
            players.add("guest" + i);
        App.setCurrentMenu(Menu.GameMenu);
        return new Result(true, "aghaaz faAliat");
    }

    public void logout() {
        App.setCurrentMenu(Menu.SignupMenu);
    }

    public void exit () {
        App.setCurrentMenu(Menu.ExitMenu);
    }
}
