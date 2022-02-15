package services.Impl;

import entities.Brand;
import entities.Notebook;
import services.NotebookService;

import java.util.ArrayList;
import java.util.List;

public class NotebookServiceImpl implements NotebookService {

    private List<Notebook> notebooks;

    public NotebookServiceImpl(){
        notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Huawei Matebook 14",144.4,24.4,78,new Brand("Huawei"),"64GB","128GB","6.5"));
        notebooks.add(new Notebook("Lenovo V14 IGL",144.4,24.4,78,new Brand("Lenovo"),"64GB","128GB","6.5"));
        notebooks.add(new Notebook("ASUS Tuf Gaming",144.4,24.4,78,new Brand("Asus"),"64GB","128GB","6.5"));
        //String name,double unitPrice,double discount,int stock,Brand brand,String ram,String memory,String screen
    }

    @Override
    public List<Notebook> getAll() {
        for (Notebook n : notebooks){
            System.out.println(n.getId()+" "+n.getName());
        }
        return notebooks;
    }

    @Override
    public boolean add(Notebook notebook) {
        notebooks.add(notebook);
        return false;
    }

    @Override
    public boolean delete(int id) {
        notebooks.remove(id);
        return true;
    }

    @Override
    public List<Brand> listByBrand(String brand) {
        return null;
    }
}
