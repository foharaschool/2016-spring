/**
 *  The LabFourTestDrive class
 *
 *@author    fohara
 */
 public class LabFourTestDrive {
     /**
     *  The main program for the LabFour class
     *
     *@param  args  The command line arguments
     */
     public static void main(String[] args) {
         
         // Instantiate three objects
         LabFour bob = new LabFour();
         LabFour sally = new LabFour();
         LabFour willy = new LabFour();
         
         // Set the data for the 3 objects
         bob.setFirstName("Bob");
         bob.setLastName("Jenkins");
         bob.setCount(10);
         bob.setSalary(45000.25);
         
         sally.setFirstName("Sally");
         sally.setLastName("Waiters");
         sally.setCount(8);
         sally.setSalary(99000.25);
         
         willy.setFirstName("Willy");
         willy.setLastName("Benson");
         willy.setCount(45);
         willy.setSalary(65000.25);
         
         bob.displayEverything();
         sally.displayEverything();
         willy.displayEverything();
     }
 }