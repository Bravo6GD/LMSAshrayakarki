package model;

public class Students {
    int student_id;

    public Students(int student_id, String name, int grade, int books_borrowed) {
        this.student_id = student_id;
        this.name = name;
        this.grade = grade;
        this.books_borrowed = books_borrowed;
    }

    String name;
    int grade;
    int books_borrowed;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getBooks_borrowed() {
        return books_borrowed;
    }

    public void setBooks_borrowed(int books_borrowed) {
        this.books_borrowed = books_borrowed;
    }
    public void print_students(){
        System.out.println("Students");
        System.out.println("The student is "+ this.name + " of class " + this.grade + " and has "+ this.books_borrowed + " books borrowed." );
    }

}

