package entities;

public class Product {
    private int id;
    private String name;
    private String describe;
    private int quantity;
    private double price;
    private String unit;

    public Product(int id, String name, String describe, int quantity, double price, String unit) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.quantity = quantity;
        this.price = price;
        this.unit = unit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }
}
