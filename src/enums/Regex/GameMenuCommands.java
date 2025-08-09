package enums.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum GameMenuCommands {
    ShowCurrentMenu
            (
                    "(\\s*)show(\\s+)current(\\s+)menu(\\s*)"
            ),
    choosingCountry
            (
                    "(\\s*)choosing(\\s+)country(\\s+)for(\\s+)(?<username>\\S+)(\\s+):(\\s*)"
            ),
    SwitchPlayer
            (
                    "(\\s*)switch(\\s+)player(\\s+)(?<username>\\S+)(\\s*)"
            ),
    ShowDetail
            (
                    "(\\s*)show(\\s+)detail(\\s+)(?<country-name>\\S+)(\\s*)"
            ),
    TileOwner
            (
                    "(\\s*)tile(\\s+)owner(\\s+)(?<index>\\S+)(\\s*)"
            ),
    TileNeighbors
            (
                    "(\\s*)tile(\\s+)neighbors(\\s+)(?<index>\\S+)(\\s*)"
            ),
    TileSeaNeighbors
            (
                    "(\\s*)tile(\\s+)sea(\\s+)neighbors(\\s+)(?<index>\\S+)(\\s*)"
            ),
    ShowWeather
            (
                    "(\\s*)show(\\s+)weather(\\s+)(?<tile-index>\\S+)(\\s*)"
            ),
    ShowTerrain
            (
                    "(\\s*)show(\\s+)terrain(\\s+)(?<tile-index>\\S+)(\\s*)"
            ),
    ShowBattalions
            (
                    "(\\s*)show(\\s+)battalions(\\s+)(?<tile-index>\\S+)(\\s*)"
            ),
    ShowFactories
            (
                    "(\\s*)show(\\s+)factories(\\s+)(?<tile-index>\\S+)(\\s*)"
            ),
    SetTerrain
            (
              "(\\s*)set(\\s+)terrain(\\s+)(?<tile-index>[\\S\\s]+)(\\s+)(?<terrain-name>\\S+)(\\s*)"
            ),
    SetWeather
            (
              "(\\s*)set(\\s+)weather(\\s+)(?<tile-index>[\\S\\s]+)(\\s+)(?<weather-name>\\S+)(\\s*)"
            );



    private final String pattern;

    GameMenuCommands(String pattern) {
        this.pattern = pattern;
    }

    public Matcher getMatcher(String input) {
        Matcher matcher = Pattern.compile(this.pattern).matcher(input);
        return matcher.matches() ? matcher : null;
    }
}


