import factory_1.Pizza;
import factory_1.SimplePizzaFactory;
import factory_2.NYOrderPizza;
import factory_2.OrderPizza;

public class Test {
    public static void main(String[] args) {

        //简单工厂模式
        SimplePizzaFactory simplePizzaFactory=new SimplePizzaFactory();
        Pizza pizza=simplePizzaFactory.CreatPizza("cheese");
        pizza.prepare();

        //工厂方法模式
        OrderPizza mOrderPizza;
        mOrderPizza = new NYOrderPizza();
    }
}
