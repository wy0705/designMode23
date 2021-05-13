package responsibilityChain;
//责任链模式
//定义：如果有多个对象有机会处理请求，责任链可使请求的发送者和接受者解耦，请求沿着责任链传递，直到有一个对象处理了它为止。
//举例（购买请求决策，价格不同要由不同的级别决定：组长、部长、副部、总裁）。
public abstract class Approver {
    Approver successor;
    String Name;
    public Approver(String Name)
    {
        this.Name=Name;
    }
    public abstract void ProcessRequest( PurchaseRequest request);
    public void SetSuccessor(Approver successor) {
        // TODO Auto-generated method stub
        this.successor=successor;
    }

}
