package responsibilityChain;

public class VicePresidentApprover extends Approver{
    public VicePresidentApprover(String Name) {
        super(Name+"VicePressidentApprover");
    }

    @Override
    public void ProcessRequest(PurchaseRequest request) {
        if ((10000 <= request.GetSum()) && (request.GetSum() < 15000)) {
            System.out.println("**This request " + request.GetID()
                    + " will be handled by " + this.Name + " **");
        } else {
            successor.ProcessRequest(request);
        }

   }
}
