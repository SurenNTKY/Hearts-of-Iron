package enums.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum LeaderboardMenuCommands {
    ShowRanking
            (
                    "(\\s*)show(\\s+)ranking(\\s*)"
            ),
    Back
            (
                    "(\\s*)back(\\s*)"
            ),
    Exit
            (
                    "(\\s*)exit(\\s*)"
            ),
    ShowHistory
            (
                    "(\\s*)show(\\s+)history(\\s*)"
            ),
    ShowCurrentMenu
            (
                    "(\\s*)show(\\s+)current(\\s+)menu(\\s*)"
            );


    private final String pattern;

    LeaderboardMenuCommands (String pattern) {
        this.pattern = pattern;
    }

    public Matcher getMatcher (String input) {
        Matcher matcher = Pattern.compile(this.pattern).matcher(input);
        return matcher.matches() ? matcher : null;
    }
}
