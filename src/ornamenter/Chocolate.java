package ornamenter;

public class Chocolate extends Decorator{
    public Chocolate(Drink obj) {
        super(obj);
        super.setDescription("Chocolate");
        super.setPrice(2.0f);
    }
}
