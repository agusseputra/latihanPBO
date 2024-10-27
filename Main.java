import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student studen1=new Student("092992","Topan");
        studen1.printStudentDetails();
        System.out.println("Please input a qty of book");
        int bookQty=scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < bookQty; i++) {
            System.out.println("Please input a code of book");
            String code=scanner.nextLine();
            System.out.println("Please input a name of book");
            String name=scanner.nextLine();
            Book book=new Book(code, name);
            studen1.addBookObj(book);
        }
        studen1.getBooksObj();
    }
}