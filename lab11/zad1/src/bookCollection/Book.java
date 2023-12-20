package bookCollection;

public class Book implements Comparable<Book>{
    public String title;
    public String author;
    public int yearPublished;
    public String genre;

    public Book(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return "Book: " +
                "yearPublished=" + yearPublished;
    }

    public int compareTo(Book o) {
        if(this.getYearPublished()>o.getYearPublished())
            return 1;
        else if (this.getYearPublished()==o.getYearPublished())
            return 0;
        return -1;
    }
}
