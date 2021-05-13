package state;
//状态模式
//定义： 在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。
//举例（人物在地点A向地点B移动，在地点B向地点A移动）。
public interface State {
    public void stop();
    public void move();

}
