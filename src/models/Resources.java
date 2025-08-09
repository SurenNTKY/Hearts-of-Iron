package models;

public class Resources {
    private int ManPower;
    private int Fuel;
    private int Sulfur;
    private int Steel;

    public Resources(int ManPower, int Fuel, int Sulfur, int Steel) {
        this.ManPower = ManPower;
        this.Fuel = Fuel;
        this.Sulfur = Sulfur;
        this.Steel = Steel;
    }

    public int getManPower() {
        return ManPower;
    }
    public int getFuel() {
        return Fuel;
    }
    public int getSulfur() {
        return Sulfur;
    }
    public int getSteel() {
        return Steel;
    }
    public void setManPower(int ManPower) {
        this.ManPower = ManPower;
    }
    public void setFuel(int Fuel) {
        this.Fuel = Fuel;
    }
    public void setSulfur(int Sulfur) {
        this.Sulfur = Sulfur;
    }
    public void setSteel(int Steel) {
        this.Steel = Steel;
    }

    public void add(Resources other) {
        this.ManPower += other.ManPower;
        this.Fuel     += other.Fuel;
        this.Sulfur     += other.Sulfur;
        this.Steel   += other.Steel;
    }

    public void subtract(Resources other) {
        this.ManPower -= other.ManPower;
        this.Fuel     -= other.Fuel;
        this.Sulfur     -= other.Sulfur;
        this.Steel   -= other.Steel;
    }

    public boolean hasEnough(Resources cost) {
        return this.ManPower >= cost.ManPower &&
                this.Fuel     >= cost.Fuel     &&
                this.Sulfur     >= cost.Sulfur     &&
                this.Steel   >= cost.Steel;
    }
}
