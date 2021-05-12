package ornamenter;
//装饰者模式
//定义：动态的将新功能附加到对象上。在对象功能扩展方面，它比继承更有弹性。
//举例(咖啡馆订单项目：1）、咖啡种类：Espresso、ShortBlack、LongBlack、Decaf2）、调料（装饰者）：Milk、Soy、Chocolate)
public abstract class Drink {
    public String description="";
    private float price=0f;;


    public void setDescription(String description)
    {
        this.description=description;
    }

    public String getDescription()
    {
        return description+"-"+this.getPrice();
    }
    public float getPrice()
    {
        return price;
    }
    public void setPrice(float price)
    {
        this.price=price;
    }
    public abstract float cost();


}
