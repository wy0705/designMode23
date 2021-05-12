package adapter.objectadapter;

import adapter.classadapter.USB;
import adapter.classadapter.USBImpl;
import adapter.classadapter.VGA;
//对象适配器
//对象适配器和类适配器使用了不同的方法实现适配，对象适配器使用组合，类适配器使用继承。
//
//举例(将USB接口转为VGA接口)
public class AdapterUSB2VGA implements VGA {
    USB u=new USBImpl();
    @Override
    public void projection() {
        u.showPPT();
    }
}
