public class LabThree {
    
    void sayHello(String parameter) {
        System.out.println("Hello there" + parameter);
    }
    
    void sayHelloAgain(String name, int counter) {
        for(int i = 1; i < counter; i++) {
            System.out.println("What is your name " + name + "?");
        }
    }
}