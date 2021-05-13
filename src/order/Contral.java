package order;
// 命令模式
//定义：将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。这样两者之间通过命令对象进行沟通，这样方便将命令对象进行储存、传递、调用、增加与管理。
//举例（开灯和关灯）
public class Contral {
    public void CommandExcute(Command command) {
        // TODO Auto-generated method stub
        command.excute();
    }

    public void CommandUndo(Command command) {
        // TODO Auto-generated method stub
        command.undo();
    }

}
