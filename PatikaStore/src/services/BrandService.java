package services;

import entities.Brand;

import java.util.List;

public interface BrandService {
    Brand getBrand(String brandName);
    List<Brand> getBrands();
    void add(Brand brand);
}
