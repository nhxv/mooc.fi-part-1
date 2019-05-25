import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> phonebook = new ArrayList<Person>();

    public void add(String name, String number) {
        Person person = new Person(name, number);
        phonebook.add(person);
    }

    public void printAll() {
        for (Person person : phonebook) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person : phonebook) {
            if (person.getName().equals(name)) {
                String phoneNumber = person.getNumber();
                return phoneNumber;
            }
        }
        String error = "number not known";
        return error;
    }
}
