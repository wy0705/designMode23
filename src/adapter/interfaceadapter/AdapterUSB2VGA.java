package adapter.interfaceadapter;
//接口适配器
//当不需要全部实现接口提供的方法时，可先设计一个抽象类实现接口，并为该接口中每个方法提供一个默认实现（空方法），那么该抽象类的子类可有选择地覆盖父类的某些方法来实现需求，它适用于一个接口不想使用其所有的方法的情况。
//
//举例(将USB接口转为VGA接口，VGA中的b()和c()不会被实现)

import adapter.classadapter.USB;
import adapter.classadapter.USBImpl;

public class AdapterUSB2VGA implements VGA{
    USB u=new USBImpl();
    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void projection() {
        u.showPPT();
    }
}
