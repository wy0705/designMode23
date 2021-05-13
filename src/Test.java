import IFlyweight.FlyweightFactory;
import IFlyweight.IFlyweight;
import adapter.classadapter.AdapterUSB2VGA;
import adapter.classadapter.Projector;
import adapter.classadapter.VGA;
import appearance.Computer;
import bridge.Camera;
import bridge.Software;
import bridge.Vivo;
import builder.DELLComputerBuilder;
import builder.Diretor;
import factory_1.Pizza;
import factory_1.SimplePizzaFactory;
import factory_2.NYOrderPizza;
import factory_2.OrderPizza;
import observer.Observer;
import observer.User;
import observer.WechatServer;
import ornamenter.*;
import responsibilityChain.*;
import strategy.AddStrategy;
import strategy.Environment;
import strategy.SubstractStrategy;
import template.Bouilli;
import template.Dish;
import template.EggWithTomato;

public class Test {
    public static void main(String[] args) {

        /*//简单工厂模式
        SimplePizzaFactory simplePizzaFactory=new SimplePizzaFactory();
        Pizza pizza=simplePizzaFactory.CreatPizza("cheese");
        pizza.prepare();*/

        /*//工厂方法模式
        OrderPizza mOrderPizza;
        mOrderPizza = new NYOrderPizza();*/

        /*//生成器模式
        Diretor diretor=new Diretor();
        DELLComputerBuilder dellComputerBuilder=new DELLComputerBuilder();
        diretor.setComputerBuilder(dellComputerBuilder);
        diretor.constructComputer();*/

        //原型模式

//        //类适配器
//        //通过适配器创建一个VGA对象，这个适配器实际是使用的是USB的showPPT（）方法
//        VGA a=new AdapterUSB2VGA();
//        //进行投影
//        Projector p1=new Projector();
//        p1.projection(a);

        /*//修饰者模式
        Drink order;
        order = new Decaf();
        System.out.println("order1 price:" + order.cost());
        System.out.println("order1 desc:" + order.getDescription());
        System.out.println("****************");
        order = new LongBlack();
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Chocolate(order);
        System.out.println("order2 price:" + order.cost());
        System.out.println("order2 desc:" + order.getDescription());*/

//        //外观模式
//        Computer computer = new Computer();
//        computer.start();
//        System.out.println("=================");
//        computer.shutDown();

        /*//桥接模式
        Vivo vivo=new Vivo();
        vivo.setSoftware(new Camera());
        vivo.run();*/

        /*//享元模式
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        IFlyweight flyweight1 = flyweightFactory.getFlyweight("A");
        IFlyweight flyweight2 = flyweightFactory.getFlyweight("B");
        IFlyweight flyweight3 = flyweightFactory.getFlyweight("A");
        ((IFlyweight) flyweight1).print();
        flyweight2.print();
        flyweight3.print();
        System.out.println(flyweightFactory.getFlyweightMapSize());
*/

        /*//策略模式
        Environment environment=new Environment(new AddStrategy());
        int result=environment.calculate(20,5);
        System.out.println(result);

        Environment environment1=new Environment(new SubstractStrategy());
        int result1=environment1.calculate(20,5);
        System.out.println(result1);
*/

        /*//模板模式
        Dish eggsWithTomato = new EggWithTomato();
        eggsWithTomato.dodish();

        System.out.println("-----------------------------");

        Dish bouilli = new Bouilli();
        bouilli.dodish();


*/
        /*//观察者模式
        WechatServer server = new WechatServer();

        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");

        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInfomation("PHP是世界上最好用的语言！");

        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("JAVA是世界上最好用的语言！");*/

       /* //责任连模式
        Client mClient = new Client();
        Approver GroupLeader = new GroupApprover("Tom");
        Approver DepartmentLeader = new DepartmentApprover("Jerry");
        Approver VicePresident = new VicePresidentApprover("Kate");
        Approver President = new PresidentApprover("Bush");

        GroupLeader.SetSuccessor(VicePresident);
        DepartmentLeader.SetSuccessor(President);
        VicePresident.SetSuccessor(DepartmentLeader);
        President.SetSuccessor(GroupLeader);

        GroupLeader.ProcessRequest(mClient.sendRequst(1, 10000, 40));
*/

    }
}
