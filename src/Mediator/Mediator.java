package Mediator;
//中介者模式
//  定义：定义一个中介对象来封装一系列对象之间的交互，使原有对象之间的耦合松散，且可以独立地改变它们之间的交互。中介者模式又叫调停模式，它是迪米特法则的典型应用。
//（通过中介卖方）
public interface Mediator {
    void register(Colleague colleague); // 客户注册

    void relay(String from, String to,String ad); // 转发

}
