package entities;

public class Phone extends Product{

    private String colour;
    private String ram;


    public Phone(String name, double price, double discount, int stock, String memory, String screenSize, String batery, Brand brand,String colour,String ram){
        super(name,price,discount,stock,memory,screenSize,batery,brand);
        this.colour = colour;
        this.ram = ram;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "colour='" + colour + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
