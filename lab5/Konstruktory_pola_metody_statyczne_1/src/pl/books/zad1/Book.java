package pl.books.zad1;

public class Book {
    private String tytul;
    private String autor;
    private int rokWydania;

    public Book() {

    }

    public Book(String tytul, String autor, int rokWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        //trzeba użyć this
    }
}
