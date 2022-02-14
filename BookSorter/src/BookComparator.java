import java.util.Comparator;

public class BookComparator implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getPage(),o2.getPage());
    }

}
