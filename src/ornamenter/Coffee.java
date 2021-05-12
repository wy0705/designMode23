package ornamenter;

import java.util.Date;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
