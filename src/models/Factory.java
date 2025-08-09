package models;

public class Factory {
    private Integer  ManPowerCost;
    private Integer  SteelCost;
    private Integer  ProductionPerManPower;
    private Integer  MaximumProduction;

    public Factory(Integer  manPowerCost, Integer  steelCost, Integer  productionPerManPower, Integer  maximumProduction) {
        ManPowerCost = manPowerCost;
        SteelCost = steelCost;
        ProductionPerManPower = productionPerManPower;
        MaximumProduction = maximumProduction;
    }

    public Integer  getManPowerCost() { return ManPowerCost; }
    public Integer  getSteelCost() { return SteelCost; }
    public Integer  getProductionPerManPower() { return ProductionPerManPower; }
    public Integer  getMaximumProduction() { return MaximumProduction; }
    public void setManPowerCost(int manPowerCost) { ManPowerCost = manPowerCost; }
    public void setSteelCost(int steelCost) { SteelCost = steelCost; }
    public void setProductionPerManPower(int productionPerManPower) { ProductionPerManPower = productionPerManPower; }
    public void setMaximumProduction(int maximumProduction) { MaximumProduction = maximumProduction; }
}
