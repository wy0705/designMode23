package factory_1;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("做了Cheese批萨");
    }
}
