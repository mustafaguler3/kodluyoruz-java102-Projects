package entities;

public class Product {

    private int id;
    private String name;
    private double price;
    private double discount;
    private int stock;
    private String memory;
    private String screenSize;
    private String batery;
    private Brand brand;
    private static int count = 0;

    public Product(String name, double price, double discount, int stock, String memory, String screenSize, String batery, Brand brand) {
        this.id = count++;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.memory = memory;
        this.screenSize = screenSize;
        this.batery = batery;
        this.brand = brand;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getBatery() {
        return batery;
    }

    public void setBatery(String batery) {
        this.batery = batery;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
