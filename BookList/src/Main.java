import java.util.*;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("A","Ahmet",80,2020);
        Book book2 = new Book("B","Hasan",70,2021);
        Book book3 = new Book("C","Musa",120,1990);
        Book book4 = new Book("D","Mehmet",200,1879);
        Book book5 = new Book("E","Mustafa",280,1992);
        Book book6 = new Book("F","Kerim",350,1994);
        Book book7 = new Book("G","Hakan",500,1995);
        Book book8 = new Book("AA","Melis",195,1996);
        Book book9 = new Book("BB","Yunus",90,1889);
        Book book10 = new Book("CC","Aslı",58,2020);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);

        Map<String,String> map = new HashMap<>();

        books.stream()
                .forEach(i->map.put(i.getName(),i.getAuthor()));

        books.stream()
                .filter(i->i.getPage()>100)
                .forEach(i-> System.out.println("Book Name : "+i.getName() + " Author : "+i.getAuthor()));




    }
}


















