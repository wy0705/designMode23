package ornamenter;

public class Decorator extends Drink{
    private Drink obj;
    public Decorator(Drink obj){
        this.obj=obj;
    }
    @Override
    public float cost() {
        return super.getPrice()+obj.cost();
    }
    public String getDescription(){
        return super.description+"-"+super.getPrice()+"&&"+obj.getDescription();
    }
}
