package adapter.classadapter;
//Projector将USB映射为VGA，只有VGA接口才可以连接上投影仪进行投影
public class Projector<T> {
    public void projection(T t){
        if (t instanceof VGA){
            System.out.println("开始投影");
            VGA v=new VGAImpl();
            v=(VGA) t;
            v.projection();
        }else {
            System.out.println("接口不匹配，无法投影");
        }
    }
}
