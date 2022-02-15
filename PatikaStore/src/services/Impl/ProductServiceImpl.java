package services.Impl;

import entities.Brand;
import entities.Product;
import services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    private List<Product> products;

    public ProductServiceImpl(){
        products = new ArrayList<>();
        products.add(new Product(0, "Iphone", 12.70, 10.0, 70, "20GB", "14,2", "5000M", new Brand("Apple")));
        products.add(new Product(1, "Asus k10", 12.70, 10.0, 70, "20GB", "14,2", "5000M", new Brand("Asus")));
        products.add(new Product(2, "Casper H7", 12.70, 10.0, 70, "20GB", "14,2", "5000M", new Brand("Casper")));
        products.add(new Product(3, "Hp c4", 12.70, 10.0, 70, "20GB", "14,2", "5000M", new Brand("HP")));
        products.add(new Product(4, "Huawei K7", 12.70, 10.0, 70, "20GB", "14,2", "5000M", new Brand("Huawei")));
        products.add(new Product(5, "Lenovo S10", 12.70, 10.0, 70, "20GB", "14,2", "5000M", new Brand("Lenovo")));
    }
    //- Apple
    //- Asus
    //- Casper
    //- HP
    //- Huawei
    //- Lenovo
    //- Monster
    //- Samsung
    //- Xiaomi

    @Override
    public void getAll() {
        for (Product p : products){
            System.out.println(p);
        }
    }

    @Override
    public Product getProduct(int id) {
        return products.get(id);
    }

    @Override
    public Product getProductsByCategory(String category) {
        return products.get(Integer.parseInt(category));
    }

    @Override
    public void deleteById(int id) {
        Product deletedProduct = products.get(id);
        products.remove(deletedProduct);
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Brand> listByBrand() {
        for (Product p : products){
            System.out.println(p.getBrand());
        }
        return null;
    }
}
