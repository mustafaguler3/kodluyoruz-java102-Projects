import entities.Brand;
import entities.Notebook;
import entities.Phone;
import services.Impl.BrandServiceImpl;
import services.Impl.NotebookServiceImpl;
import services.Impl.PhoneServiceImpl;
import services.Impl.ProductServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductServiceImpl productService = new ProductServiceImpl();
        NotebookServiceImpl notebookService = new NotebookServiceImpl();
        PhoneServiceImpl phoneService = new PhoneServiceImpl();
        BrandServiceImpl brandService = new BrandServiceImpl();
        while (true) {


            System.out.println("PatikaStore Product Management Panel !"+"\n"
                    +"1- Notebook Process "+"\n"
                    +"2- Cell Phone Process "+"\n"
                    +"3- List Brand "+"\n"
                    +"0- Exit !"
            );
            int choice;
            try {
                choice = scanner.nextInt();
                System.out.println();
            } catch (Exception e) {
                System.out.println("Enter a number!");
                scanner.nextLine();
                continue;
            }

            if (choice == 0) {
                System.out.println("See you again!");
                break;
            } else if (choice == 1) {
                while (true) {
                    System.out.println("Notebook Process\n0 - Back\n1 - Add Notebook\n2 - Delete a notebook\n3 - List by brand\n4 - List All Notebook\n");
                    System.out.print("your choice: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();

                    if (choice == 0)
                        break;
                    else if (choice == 1) {
                        System.out.print("\nEnter a name of product that will be added: : ");
                        String name = scanner.nextLine();
                        System.out.print("Enter a brand of product that will be added: ");
                        String brandName = scanner.nextLine();
                        System.out.print("Enter a price of product that will be added: : ");
                        double price = scanner.nextDouble();
                        scanner.nextLine();

                        Brand brand = brandService.getBrand(brandName);
                        if (brand == null) {
                            brand = new Brand(brandName);
                            brandService.add(brand);
                        }

                        if (notebookService.add(new Notebook(name,price,4.7,4,brand,"8GB","64GB","8.4")));
                            System.out.println("Product added");
                    } else if (choice == 2) {
                        System.out.print("\nEnter a id that will be deleted: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        if (notebookService.delete(id))
                            System.out.println("Product deleted");
                        else
                            System.out.println("Product can not be deleted.");
                    } else if (choice == 3) {
                        System.out.print("\nEnter a brand: ");
                        String brand = scanner.nextLine();
                        notebookService.listByBrand(brand);
                    } else if (choice == 4) {
                        notebookService.getAll();
                    } else {
                        System.out.println("\nNo valid value\n");
                        continue;
                    }
                }

            } else if (choice == 2) {
                while (true) {
                    System.out.println("Cell Phone Process\n0 - Back\n1 - Add Phone\n2 - Delete a phone\n3 - List By brand\n4 - List All Phone\n");

                    System.out.print("Your choice: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();

                    if (choice == 0)
                        break;
                    else if (choice == 1) {
                        System.out.print("\nEnter a name of product that will be added: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter a brand of product that will be added: ");
                        String brandName = scanner.nextLine();
                        System.out.print("Enter a price that will be added: ");
                        double price = scanner.nextDouble();
                        scanner.nextLine();

                        Brand brand = brandService.getBrand(brandName);
                        if (brand == null) {
                            brand = new Brand(brandName);
                            brandService.add(brand);
                        }

                        if (phoneService.add(new Phone(name,price,7.1,7,"64GB","8.2","500MA",brand,"Red","8GB")))
                            System.out.println("Product added");
                    } else if (choice == 2) {
                        System.out.print("\nEnter a id that will be deleted: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        if (phoneService.delete(id))
                            System.out.println("product deleted ");
                        else
                            System.out.println("product can not be deleted .");
                    } else if (choice == 3) {
                        System.out.print("\nEnter a brand: ");
                        String brand = scanner.nextLine();
                        phoneService.listByBrand(brand);
                    } else if (choice == 4) {
                        phoneService.getAll();
                    } else {
                        System.out.println("\nNo valid value!\n");
                        continue;
                    }
                }
            } else if (choice == 3) {
                brandService.getBrands();
            } else {
                System.err.println("No valid value!");
                continue;
            }
        }
    }
}
