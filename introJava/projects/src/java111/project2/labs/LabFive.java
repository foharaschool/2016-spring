/**
 *  The LabFive class which will deal with Arrays of Objects 
 *
 *@author    fohara
 */
 public class LabFive {
     
     // Instantiate array variable
     LabFour[] people = new LabFour[3];
     
    // People setup method
    void setup() {
        people[0] = new LabFour();
        people[1] = new LabFour();
        people[2] = new LabFour();
        
        // use set method to populate data
        people[0].setFirstName("Frank");
        people[0].setLastName("Frankly");
        people[0].setCount(10);
        people[0].setSalary(251515);
        
        people[1].setFirstName("Daffny");
        people[1].setLastName("Pomgarten");
        people[1].setCount(2);
        people[1].setSalary(251515);
        
        people[2].setFirstName("Willis");
        people[2].setLastName("Tanner");
        people[2].setCount(1);
        people[2].setSalary(251515);
    }
    // While loop way of iterating through people
    void runWhile() {
        int count = 0;
        while(count < people.length) {
            people[count].displayEverything();
            System.out.println("Count: " + count);
            count++;
        } 
    }
    
    // For loop way of iterating through people
    void runFor() {
        for(int i = 0; i < people.length; i++) {
            people[i].displayEverything();
            System.out.println("Count: " + i);
        }
    } 
 }
