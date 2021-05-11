package factory_2;

import factory_1.Pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("做了LDCheesePizza批萨");
    }
}
