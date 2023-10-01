package Lab1.Task5;

public class Item {
    private String name;
    private double price;
    private double weight;
    private double size;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public double getSize() {
        return size;
    }

    public Item(String name, double price, double weight, double size) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.size = size;

    }
}

