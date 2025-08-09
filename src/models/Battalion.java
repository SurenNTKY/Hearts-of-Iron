package models;

public class Battalion {
    private int Infantry;
    private int Panzer;
    private int AirForce;
    private int Navy;

    public Battalion(int infantry, int panzer, int airForce, int navy) {
        Infantry = infantry;
        Panzer = panzer;
        AirForce = airForce;
        Navy = navy;
    }

    public int getInfantry() { return Infantry; }
    public int getPanzer() { return Panzer; }
    public int getAirForce() { return AirForce; }
    public int getNavy() { return Navy; }
    public void setInfantry(int infantry) { Infantry = infantry; }
    public void setPanzer(int panzer) { Panzer = panzer; }
    public void setAirForce(int airForce) { AirForce = airForce; }
    public void setNavy(int navy) { Navy = navy;
    }
}
