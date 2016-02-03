public class MyNameLoop {
    
    String fullname = "Fred O'Hara";
    int counter = 10;
    
    void nameLoop() {
        while(counter > 0) {
            System.out.println("My name is: " + fullname);
            counter--;
        }
    }
}