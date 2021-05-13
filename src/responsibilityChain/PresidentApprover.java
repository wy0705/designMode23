package responsibilityChain;

public class PresidentApprover extends Approver{
    public PresidentApprover(String Name) {
        super(Name+"PresidentApprover");
    }

    @Override
    public void ProcessRequest(PurchaseRequest request) {
        if ((15000 <= request.GetSum()) && (request.GetSum() < 20000)) {
            System.out.println("**This request " + request.GetID()
                    + " will be handled by " + this.Name + " **");
        } else {
            successor.ProcessRequest(request);
        }

    }
}
