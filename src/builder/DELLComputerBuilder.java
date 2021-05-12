package builder;

public class DELLComputerBuilder extends ComputerBuilder{
    @Override
    public void buildMaster() {
        computer.setMaster("i5,8g,512SSD,1060");
        System.out.println("(i7,16g,512SSD,1060)的戴尔主机");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("1080p");
        System.out.println("(1080p)的戴尔显示屏");
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyboard("cherry 红轴机械键盘");
        System.out.println("(cherry 红轴机械键盘)的键盘");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("MI 鼠标");
        System.out.println("(MI 鼠标)的鼠标");
    }

    @Override
    public void buildAudio() {
        computer.setAudio("飞利浦 音响");
        System.out.println("(飞利浦 音响)的音响");
    }
}
