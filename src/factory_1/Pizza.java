package factory_1;

public abstract class Pizza {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void prepare();
}
