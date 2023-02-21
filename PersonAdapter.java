public class PersonAdapter {
    private Person person;

    public PersonAdapter(Person person) {
        this.person = person;
    }

    public Customer getCustomer() {
        String[] nameParts = person.getFullName().split(" ");
        String lastName = "";
        String firstName = "";
        //Checking for Last Name in 4-word names
        if(nameParts.length % 2 == 0 && nameParts.length > 2) {
            lastName = nameParts[nameParts.length / 2].concat(" ").concat(nameParts[nameParts.length - 1]);
            for (int i = 0; i < nameParts.length - 2; i++) {
                firstName += nameParts[i] + " ";
            }
        }
        //Checking for Last Name in lesser than 4-word names
        else if (nameParts.length > 1) {
            lastName = nameParts[nameParts.length - 1];
            for (int i = 0; i < nameParts.length - 1; i++) {
                firstName += nameParts[i] + " ";
            }
        }
        else {
            firstName = nameParts[0];
        }
        return new Customer(lastName, firstName.trim());
    }
}
