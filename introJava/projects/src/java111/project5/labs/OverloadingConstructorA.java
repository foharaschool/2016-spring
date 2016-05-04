package java111.project5.labs;

public class OverloadingConstructorA {
    
    private String name;
    private int size;
    
    OverloadingConstructorA() {
        name = "Fred";
        size = 13;
    }
    
    OverloadingConstructorA(int setSize) {
        this();
        size = setSize;
        
    }
    
    OverloadingConstructorA(String setName) {
        this();
        name = setName;
    }
    
    public String toString() {
        return "Name: " + name + " Size: " + size;
    }
}