package services;

import entities.Brand;
import entities.Notebook;

import java.util.List;

public interface NotebookService {

    List<Notebook> getAll();
    boolean add(Notebook notebook);
    boolean delete(int id);
    List<Brand> listByBrand(String brand);

}
