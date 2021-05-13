package state;

public class OnMove implements State{
    private Player context;

    public OnMove(Player context) {
        this.context = context;
    }

    @Override
    public void move() {
        System.out.println("处于地点B,开始向A移动");
        System.out.println("--------");
        context.setDirection("BA");
        context.setState(context.onMove);

    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("正处在地点B，不用停止移动");
        System.out.println("--------");
    }
}
