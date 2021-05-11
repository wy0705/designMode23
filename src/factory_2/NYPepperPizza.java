package factory_2;

import factory_1.Pizza;

public class NYPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("做了NYPepperPizza批萨");
    }
}
