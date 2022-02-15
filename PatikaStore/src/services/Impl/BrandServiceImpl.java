package services.Impl;

import entities.Brand;
import services.BrandService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BrandServiceImpl implements BrandService {

    private List<Brand> brands;

    public BrandServiceImpl(){
        brands = new ArrayList<>();
        brands.add(new Brand("Samsung"));
        brands.add(new Brand("Lenovo"));
        brands.add(new Brand("Apple"));
        brands.add(new Brand("Huawei"));
        brands.add(new Brand("Casper"));
        brands.add(new Brand("Asus"));
        brands.add(new Brand("HP"));
        brands.add(new Brand("Xiaomi"));
        brands.add(new Brand("Monster"));
    }

    @Override
    public Brand getBrand(String brandName) {
        Iterator<Brand> iterator = brands.iterator();

        while (iterator.hasNext()){
            Brand current = iterator.next();
            if (current.getName().equalsIgnoreCase(brandName)){
                return current;
            }
        }
        return null;
    }

    @Override
    public List<Brand> getBrands() {
        for (Brand b : brands){
            System.out.println(b.getName());
        }
        return null;
    }

    @Override
    public void add(Brand brand) {
        this.brands.add(brand);
    }
}
