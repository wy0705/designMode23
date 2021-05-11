package factory_1;

public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("做了Prepper批萨");
    }
}
