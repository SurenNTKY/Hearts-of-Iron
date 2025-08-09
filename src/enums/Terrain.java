package enums;

public enum Terrain {
    mountain(50, null, 1000, 0),
    forest(120, 125, null, null),
    desert(90, null, 500, 0),
    urban(110, null, 500, 0),
    plain(null, 140, null, null);

    private final Integer attack;
    private final Integer airAttack;
    private final Integer factoryCost;
    private final Integer fuelProduction;

    Terrain(Integer attack, Integer airAttack, Integer factoryCost, Integer fuelProduction) {
        this.attack = attack;
        this.airAttack = airAttack;
        this.factoryCost = factoryCost;
        this.fuelProduction = fuelProduction;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getAirAttack() {
        return airAttack;
    }

    public Integer getFactoryCost() {
        return factoryCost;
    }

    public Integer getFuelProduction() {
        return fuelProduction;
    }
}
