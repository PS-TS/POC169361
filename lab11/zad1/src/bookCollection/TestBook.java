package bookCollection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class TestBook {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(2000));
        books.add(new Book(1995));
        books.add(new Book(2005));
        books.add(new Book(1990));
        books.add(new Book(2010));

        Collections.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }
    }

}
