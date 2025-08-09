package enums;

import models.Factory;

public enum FactoryType {
    SteelFactory(new Factory(10000,null,10,30000)),
    SulfurFactory(new Factory(20000,null,20,20000)),
    FuelRefinery(new Factory(50000,5000,50,100000));

    private final Factory factory;

    FactoryType(Factory factory) {
        this.factory = factory;
    }

    public Factory getFactory() {
        return factory;
    }
}
