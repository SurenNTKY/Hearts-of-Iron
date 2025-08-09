package enums;

public enum BattalionType {
    Infantry("Infantry", 15000, null, 10000, 10000),
    Panzer("Panzer", 5000, 10000, 20000, 10000),
    AirForce("AirForce", 1000, 50000, 35000, 10000),
    Navy("Navy", 5000, 30000, 50000, 10000);

    private final String displayName;
    private final Integer manPowerCost;
    private final Integer fuelCost;
    private final Integer steelCost;
    private final Integer sulfurCost;

    BattalionType(String displayName,
                  Integer manPower,
                  Integer fuel,
                  Integer steel,
                  Integer sulfur) {
        this.displayName = displayName;
        this.manPowerCost = manPower;
        this.fuelCost = fuel;
        this.steelCost = steel;
        this.sulfurCost = sulfur;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Integer getManPowerCost() {
        return manPowerCost;
    }

    public Integer getFuelCost() {
        return fuelCost;
    }

    public Integer getSteelCost() {
        return steelCost;
    }

    public Integer getSulfurCost() {
        return sulfurCost;
    }
}