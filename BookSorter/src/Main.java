import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Set<Book> books = new TreeSet<Book>();
        books.add(new Book("E",41,"E",2000));
        books.add(new Book("A",30,"A",2001));
        books.add(new Book("B",20,"B",1995));
        books.add(new Book("C",42,"C",1990));
        books.add(new Book("D",41,"D",1996));

        BookComparator comparator = new BookComparator();
        Set<Book> sortedBooks = new TreeSet<Book>(comparator);

        sortedBooks.addAll(books);

        for(Book b : sortedBooks){
            System.out.println(b);
        }


        //Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız. Sonra ikinci kez Set tipinden bir veri yapısı kullanın ve kitapları sayfa sayısına göre sıralamasını sağlayınız.

    }
}
