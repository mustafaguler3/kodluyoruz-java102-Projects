package services.Impl;

import entities.Brand;
import entities.Phone;
import services.PhoneService;

import java.util.ArrayList;
import java.util.List;

public class PhoneServiceImpl implements PhoneService {

    private List<Phone> phones;

    public PhoneServiceImpl(){
        phones = new ArrayList<>();
        phones.add(new Phone("SAMSUNG GALAXY A51",14.75,17.0,75,"128GB","6.5","6500MA",new Brand("Samsung"),"Red","8GB"));
        phones.add(new Phone("IPHONE 11 64GB",25.75,17.0,75,"64GB","6.1","3200MA",new Brand("Apple"),"Gold","8GB"));
        phones.add(new Phone("REDMI NOTE 10 PRO",12.75,17.0,75,"128GB","6.5","6500MA",new Brand("Xiaomi"),"Grey","8GB"));
        //int id, String name, double price, double discount, int stock, String memory, String screenSize, String batery, Brand brand
    }

    @Override
    public List<Phone> getAll() {
        for (Phone p : phones){
            System.out.println(p.getId()+" "+p.getName());
        }
        return phones;
    }

    @Override
    public boolean add(Phone phone) {
        phones.add(phone);
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Brand> listByBrand(String brand) {
        return null;
    }
}
