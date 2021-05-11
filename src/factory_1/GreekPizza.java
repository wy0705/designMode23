package factory_1;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("做了Greek批萨");
    }
}
