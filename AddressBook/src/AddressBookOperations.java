import java.util.HashSet;

public class AddressBookOperations {

    HashSet<Contact> addewssBookset = new HashSet<>();
    InputsDetails in = new InputsDetails();

    public void add() {
        Contact contact = new Contact(in.addFName(),in.addSName(),in.addAddress(),in.addCity(),in.addState(),in.addZip(),in.addno(),in.addmail());
        addewssBookset.add(contact);
    }

    public void display(){
        System.out.println("\n" + addewssBookset);
    }
}
