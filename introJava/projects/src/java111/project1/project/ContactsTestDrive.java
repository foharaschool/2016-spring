public class ContactsTestDrive {
    public static void main(String[] args) {
        Contacts fred = new Contacts();
        fred.firstName = "Fred";
        fred.lastName = "O'Hara";
        fred.address = "111 State St";
        fred.phone = "608-512-7777";
        fred.email = "fohara@madisoncollege.edu";
        
        fred.display();
        
    }
}