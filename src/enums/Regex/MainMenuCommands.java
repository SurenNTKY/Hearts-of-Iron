package enums.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum MainMenuCommands {
    Leaderboard
            (
                  "(\\s*)leaderboard(\\s*)"
            ),
    ShowCurrentMenu
            (
                    "(\\s*)show(\\s+)current(\\s+)menu(\\s*)"
            ),
    Play
            (
              "(\\s*)play(\\s+)(?<user1>[\\S\\s]+)(\\s+)(?<user2>[\\S\\s]+)(\\s+)" +
                      "(?<user3>[\\S\\s]+)(\\s+)(?<user4>\\S+)(\\s*)"
            ),
    Logout
            (
              "(\\s*)logout(\\s*)"
            ),
    Exit
            (
              "(\\s*)exit(\\s*)"
            );

    private final String pattern;

    MainMenuCommands (String pattern) {
        this.pattern = pattern;
    }

    public Matcher getMatcher (String input) {
        Matcher matcher = Pattern.compile(this.pattern).matcher(input);
        return matcher.matches() ? matcher : null;
    }
}
