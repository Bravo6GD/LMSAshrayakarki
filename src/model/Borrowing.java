package model;

public class Borrowing {
    int book_id;

    public int getBooks_borrowed() {
        return books_borrowed;
    }

    public void setBooks_borrowed(int books_borrowed) {
        this.books_borrowed = books_borrowed;
    }

    public Borrowing(int books_borrowed) {
        this.books_borrowed = books_borrowed;
    }

    int books_borrowed;

    public Borrowing(int book_id, int student_id, int extra_days, int fine_rate) {
        this.book_id = book_id;
        this.student_id = student_id;
        this.extra_days = extra_days;
        this.fine_rate = fine_rate;
    }

    int student_id;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getExtra_days() {
        return extra_days;
    }

    public void setExtra_days(int extra_days) {
        this.extra_days = extra_days;
    }

    public int getFine_rate() {
        return fine_rate;
    }

    public void setFine_rate(int fine_rate) {
        this.fine_rate = fine_rate;
    }

    int extra_days;
    int fine_rate;

    public int borr(){
        int extra_days = this.extra_days;
        int fine = extra_days * 50;
        System.out.println("The total fine for bookid " + this.book_id + " for "+ this.extra_days + " extra days is " + fine);
        return fine;

    }
}

