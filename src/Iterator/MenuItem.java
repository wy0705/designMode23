package Iterator;

public class MenuItem {
    private String name;
    private String description;
    private boolean Vegetable;
    private float price;

    public MenuItem() {
    }

    public MenuItem(String name, String description, boolean vegetable, float price) {
        this.name = name;
        this.description = description;
        Vegetable = vegetable;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetable() {
        return Vegetable;
    }

    public void setVegetable(boolean vegetable) {
        Vegetable = vegetable;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
