import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student pekka = new Student("Pekka Mikkola", "013141590");
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            } else {
                System.out.println("studentnumber: ");
                String studentNumber = reader.nextLine();
                list.add( new Student(name, studentNumber) );
            }
        }

        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("");

        System.out.println("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result:");
        for (Student studentSearch : list) {
            String studentName = studentSearch.getName();
            if (studentName.contains(search)) {
                System.out.println(studentSearch);
            }
        }

    }
}
