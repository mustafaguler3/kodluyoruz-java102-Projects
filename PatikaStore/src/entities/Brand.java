package entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Brand implements Comparable<Brand> {

    private int id;
    private String name;
    private static int count = 0;

    public Brand(String name) {
        this.id = count++;
        this.name = name;
    }

    public static List<Brand> getBrands(){
        List<Brand> list = new ArrayList<>();
        list.add(new Brand("Samsung"));
        list.add(new Brand("Lenovo"));
        list.add(new Brand("Apple"));
        list.add(new Brand("Huawei"));
        list.add(new Brand("Casper"));
        list.add(new Brand("Asus"));
        list.add(new Brand("HP"));
        list.add(new Brand("Xiaomi"));
        list.add(new Brand("Monster"));

        return list;
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

    @Override
    public String toString() {
        return "- " + name ;
    }

    @Override
    public int compareTo(Brand o) {
        return this.getName().compareTo(o.name);
    }
}
