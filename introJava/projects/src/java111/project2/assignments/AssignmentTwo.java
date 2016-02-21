// This class creates an array to hold fruit objects and runs initialization
public class AssignmentTwo {
    // Inst var to create and hold FruitCount objects
    FruitCount[] fruitBowl = new FruitCount[5];
    public int fruitCount = 0;
    
    // Run method
    public void run() {
        // Create 5 unique FruitCount objects
        fruitBowl[0] = new FruitCount();
        fruitBowl[1] = new FruitCount();
        fruitBowl[2] = new FruitCount();
        fruitBowl[3] = new FruitCount();
        fruitBowl[4] = new FruitCount();
        
        // Set names
        fruitBowl[0].setFruit("banana");
        fruitBowl[1].setFruit("peach");
        fruitBowl[2].setFruit("pear");
        fruitBowl[3].setFruit("apple");
        fruitBowl[4].setFruit("orange");
       
        
        // Set counts
        fruitBowl[0].setTally(4);
        fruitBowl[1].setTally(6);
        fruitBowl[2].setTally(1);
        fruitBowl[3].setTally(9);
        fruitBowl[4].setTally(4);
        
        // Count total of all fruit objects
        for(int i = 0; i < fruitBowl.length; i++) {
            fruitCount += fruitBowl[i].getTally();
        }
        
        // Output total count 
        System.out.println("Total fruit in fruit bowl: " + fruitCount);
    }
    
    
}