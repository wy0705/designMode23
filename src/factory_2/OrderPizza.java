package factory_2;

import factory_1.Pizza;

public abstract class OrderPizza {
    public abstract Pizza createPizza(String ordertype);
}
