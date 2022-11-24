package model;

public class Books {
    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getName_of_book() {
        return name_of_book;
    }

    public void setName_of_book(String name_of_book) {
        this.name_of_book = name_of_book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getP_year() {
        return p_year;
    }

    public void setP_year(int p_year) {
        this.p_year = p_year;
    }

    public Books(int book_id, String name_of_book, String author, int isbn, int p_year) {
        this.book_id = book_id;
        this.name_of_book = name_of_book;
        this.author = author;
        this.isbn = isbn;
        this.p_year = p_year;
    }

    int book_id;
    String name_of_book;
    String author;
    int isbn;
    int p_year;

    public void print_books (){
        System.out.println("Books");
        System.out.println("Name: " + this.name_of_book  );
        System.out.println("Author: " + this.author  );
        System.out.println("ISBN: " + this.isbn  );
        System.out.println("Published year: " + this.p_year  );

    }
}
