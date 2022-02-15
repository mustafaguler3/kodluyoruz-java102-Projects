package services;

import entities.Brand;
import entities.Phone;

import java.util.List;

public interface PhoneService {
    List<Phone> getAll();
    boolean add(Phone phone);
    boolean delete(int id);
    List<Brand> listByBrand(String brand);
}
