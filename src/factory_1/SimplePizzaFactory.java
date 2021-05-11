package factory_1;
//定义：定义了一个创建对象的类，由这个类来封装实例化对象的行为。
//
//举例：（我们举一个pizza工厂的例子）
//
//pizza工厂一共生产三种类型的pizza：chesse,pepper,greak。通过工厂类（SimplePizzaFactory）实例化这三种类型的对象。
public class SimplePizzaFactory {
    public Pizza CreatPizza(String ordertype){
        Pizza pizza=null;
        if (ordertype.equals("cheese")){
            pizza=new CheesePizza();
        }else if (ordertype.equals("greek")){
            pizza=new GreekPizza();
        }else if (ordertype.equals("pepper")){
            pizza=new PepperPizza();
        }
        return pizza;
    }
}
