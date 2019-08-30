package decorator;

public abstract class Beverage {
    String description;
    String size;

    public String getDescription() {
        return description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract double cost();
}
