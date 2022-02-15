package entities;

public class Notebook extends Product{

    public Notebook(String name,double unitPrice,double discount,int stock,Brand brand,String ram,String memory,String screen){
        super(name,unitPrice,discount,stock,memory,screen,"4500",brand);
    }

}
