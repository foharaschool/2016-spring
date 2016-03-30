public class Lab2Testdrive {
    public static void main(String[] args) {
        Messenger bob = new Messenger();
        Messenger jose = new SpanishMessenger();
        
        bob.message();
        jose.message();
    }
}