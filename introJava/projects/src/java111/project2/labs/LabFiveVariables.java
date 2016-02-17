// Class to store count variables
public class LabFiveVariables {
    private int count = 1;
    
    // accessor methods
    void setCount(int count) {
        this.count = count;
    }
    
    int getCount() {
        return count;
    }
    
    void run() {
        int count = 10;
        System.out.println(count);
        System.out.println(this.count);
    }
    
}