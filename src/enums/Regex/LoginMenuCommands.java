package enums.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum LoginMenuCommands {
    Login
            (
              "(\\s*)login(\\s+)-username(\\s+)(?<username>\\S+)(\\s+)" +
                      "-password(\\s+)(?<password>.*)(\\s*)"
            ),
    ForgetPassword
            (
                    "(\\s*)forget(\\s+)-(\\s+)password(\\s+)" +
                            "-username(\\s)(?<username>\\S+)(\\s+)-email(\\s+)(?<email>.*)(\\s*)"
            ),
    ShowCurrentMenu
            (
                    "(\\s*)show(\\s+)current(\\s+)menu(\\s*)"
            ),
    Back
            (
                    "(\\s*)back(\\s*)"
            ),
    Exit
            (
                    "(\\s*)exit(\\s*)"
            );

    private final String pattern;

    LoginMenuCommands (String pattern) {
        this.pattern = pattern;
    }

    public Matcher getMatcher (String input) {
        Matcher matcher = Pattern.compile(this.pattern).matcher(input);
        return matcher.matches() ? matcher : null;
    }
}
