import java.util.ArrayList;

public class Student extends Person{
    String nim;
    ArrayList books;
    ArrayList<Book> booksObj=new ArrayList<>();
    public Student(String nim,  String name) {
        this.nim = nim;
        this.name = name;
        this.books = new ArrayList();
    }
    public void printStudentDetails() {
        System.out.println("NIM: " + nim);
        System.out.println("Name: " + name);
    }
      // Method to get the courses of the student
    public ArrayList getBooks() {
        return books;
    }
    // Method to add a course to the student's course list
    public void addBook(String book) {
        books.add(book);
    }
 
    public void addBookObj(Book book){
        booksObj.add(book);
    }
    public void getBooksObj(){
        System.out.println("Student Name: " + name);
        for (Book item : booksObj) {
            System.err.println("Book Code "+ item.code+
            ", Book Name "+item.bookName);
        }
    }
}
