package strategy;
//策略模式
//定义： 策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。
//举例如下（ 实现一个加减的功能）
public interface Strategy {
    public int calc(int num1,int num2);

}
