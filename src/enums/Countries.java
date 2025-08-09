package enums;

import models.Resources;

import java.util.List;

public enum Countries {
    GermanReich("German Reich",
            new Resources(60000000,100000,200000,300000),
            List.of(TileType.Tile35,TileType.Tile36,TileType.Tile37,TileType.Tile38,TileType.Tile39,
                    TileType.Tile40,TileType.Tile41,TileType.Tile42,TileType.Tile43,TileType.Tile44,
                    TileType.Tile45,TileType.Tile46,TileType.Tile47,TileType.Tile48,TileType.Tile49,TileType.Tile50),
            Leader.Hitler),
    SovietUnion("Soviet Union",
            new Resources(160000000,300000,50000,100000),
            List.of(TileType.Tile1,TileType.Tile2,TileType.Tile3,TileType.Tile4,TileType.Tile5,TileType.Tile6,
                    TileType.Tile7,TileType.Tile8,TileType.Tile9,TileType.Tile10,TileType.Tile11,TileType.Tile12,
                    TileType.Tile13,TileType.Tile14,TileType.Tile15,TileType.Tile16),
            Leader.Stalin),
    UnitedStates("United States",
            new Resources(120000000,200000,100000,200000),
            List.of(TileType.Tile17,TileType.Tile18,TileType.Tile19,TileType.Tile20,TileType.Tile21,
                    TileType.Tile22,TileType.Tile23,TileType.Tile24,TileType.Tile25,TileType.Tile26,TileType.Tile27,
                    TileType.Tile28,TileType.Tile29,TileType.Tile30,TileType.Tile31,TileType.Tile32,
                    TileType.Tile33,TileType.Tile34),
            Leader.Roosevelt),
    UnitedKingdom("United Kingdom",
            new Resources(30000000,0,1,10),
            List.of(TileType.Tile54,TileType.Tile55,TileType.Tile56),
            Leader.Churchill),
    Japan("Japan",
            new Resources(70000000,50000,50000,50000),
            List.of(TileType.Tile51,TileType.Tile52,TileType.Tile53),
            Leader.Hirohito),;

    private final String countryName;
    private final Resources resources;
    private final List<TileType> tiles;
    private final Leader leader;

    Countries(String countryName, Resources resources,List<TileType> tiles, Leader leader) {
        this.countryName = countryName;
        this.resources = resources;
        this.tiles = tiles;
        this.leader = leader;
    }
    public String getCountryName() {
        return countryName;
    }
    public Resources getResources() {
        return resources;
    }
    public List<TileType> getTiles() { return tiles; }
    public Leader getLeader() { return leader; }

}
