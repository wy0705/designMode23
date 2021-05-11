package factory_2;

import factory_1.CheesePizza;
import factory_1.PepperPizza;
import factory_1.Pizza;

public class NYOrderPizza extends OrderPizza{
    public Pizza createPizza(String ordertype) {
        Pizza pizza = null;

        if (ordertype.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new NYPepperPizza();
        }
        return pizza;

    }

}
