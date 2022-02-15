package services;

import entities.Brand;
import entities.Product;

import java.util.List;

public interface ProductService {
    void getAll();
    Product getProduct(int id);
    Product getProductsByCategory(String category);
    void deleteById(int id);
    void add(Product product);
    List<Brand> listByBrand();
}
