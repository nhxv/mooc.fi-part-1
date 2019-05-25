import java.util.ArrayList;
import java.util.Collections;

public class RemoveLast {
    public static void main(String[] args) {
        ArrayList<String> persons = new ArrayList<String>();
        persons.add("Pekka");
        persons.add("James");
        persons.add("Liz");
        persons.add("Brian");

        System.out.println("Persons:");
        System.out.println(persons);

        Collections.sort(persons);

        removeLast(persons);

        System.out.println(persons);
    }

    public static void removeLast(ArrayList<String> list) {
        list.remove(list.size()-1);
    }
}
