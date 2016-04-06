import java.util.*;

public class Lab7TestDrive {
    public static void main(String[] args) {
        ArrayList<Event> displayer = new ArrayList<Event>();
        displayer.add(new Meeting());
        displayer.add(new Marathon());
    
        displayer.get(0).display();
        displayer.get(1).display();
    }
}