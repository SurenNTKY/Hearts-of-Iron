package enums.Regex;

import views.ExitMenu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum SignupMenuCommands {
    Register
            (
                    "(\\s*)register(\\s+)-username(\\s+)(?<username>\\S+)(\\s+)-password(\\s+)" +
                            "(?<password>.*)(\\s+)-email(\\s+)(?<email>.*)(\\s*)"
            ),
    ShowCurrentMenu
            (
                    "(\\s*)show(\\s+)current(\\s+)menu(\\s*)"
            ),
    Login
            (
                    "(\\s*)login(\\s*)"
            ),
    Exit
            (
              "(\\s*)exit(\\s*)"
            );

    private final String pattern;

    SignupMenuCommands (String pattern) {
        this.pattern = pattern;
    }

    public Matcher getMatcher (String input) {
        Matcher matcher = Pattern.compile(this.pattern).matcher(input);
        return matcher.matches() ? matcher : null;
    }
}