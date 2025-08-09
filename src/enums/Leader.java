package enums;

public enum Leader {
    Adenauer("Adenauer", Countries.GermanReich, LeaderIdeologies.Democracy),
    Pieck("Pieck", Countries.GermanReich, LeaderIdeologies.Communism),
    Hitler("Hitler", Countries.GermanReich, LeaderIdeologies.Fascism),
    ZombieLenin("Zombie-Lenin", Countries.SovietUnion, LeaderIdeologies.Democracy),
    Stalin("Stalin", Countries.SovietUnion, LeaderIdeologies.Communism),
    Trotsky("Trotsky", Countries.SovietUnion, LeaderIdeologies.Fascism),
    Roosevelt("Roosevelt", Countries.UnitedStates, LeaderIdeologies.Democracy),
    Browder("Browder", Countries.UnitedStates, LeaderIdeologies.Communism),
    Pelley("Pelley", Countries.UnitedStates, LeaderIdeologies.Fascism),
    Churchill("Churchill", Countries.UnitedKingdom, LeaderIdeologies.Democracy),
    Mosley("Mosley", Countries.UnitedKingdom, LeaderIdeologies.Fascism),
    Hirohito("Hirohito", Countries.Japan, LeaderIdeologies.Fascism);

    private final String leaderName;
    private final Countries country;
    private final LeaderIdeologies leaderIdeologies;


    Leader(String leaderName, Countries country, LeaderIdeologies leaderIdeologies) {
        this.leaderName = leaderName;
        this.country = country;
        this.leaderIdeologies = leaderIdeologies;
    }

    public String getLeaderName() {
        return leaderName;
    }
    public Countries getCountry() {
        return country;
    }
    public LeaderIdeologies getLeaderIdeologies() {
        return leaderIdeologies;
    }
}
