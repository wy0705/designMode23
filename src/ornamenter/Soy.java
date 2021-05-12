package ornamenter;

public class Soy extends Decorator{
    public Soy(Drink obj) {
        super(obj);
        super.setDescription("Soy");
        super.setPrice(2.0f);
    }
}
