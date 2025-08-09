package enums;

public enum Weather {
    Sunny(null,null),
    Rainy(80,10),
    Blizzard(60,30),
    Sandstorm(30,60),
    Fog(20,70);

    private final Integer attack;
    private final Integer airAttack;

    Weather(Integer attack, Integer airAttack) {
        this.attack = attack;
        this.airAttack = airAttack;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getAirAttack() {
        return airAttack;
    }
}
