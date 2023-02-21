import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Marnus Labuschagne"));
        persons.add(new Person("Soorya Sahar Puducode Narayanan"));
        persons.add(new Person("James Haggrid Mathew"));
        persons.add(new Person("Leo"));

        ArrayList<Customer> customers = new ArrayList<>();
        for (Person person : persons) {
            PersonAdapter adapter = new PersonAdapter(person);
            customers.add(adapter.getCustomer());
        }

        System.out.println("Customers: ");
        int count = 1;
        for (Customer customer : customers) {
            System.out.println(count + ")" + " " + customer.getFirstName() + "\t" + customer.getLastName());
            count++;
        }
    }
}
