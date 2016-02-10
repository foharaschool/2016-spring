/**
 *  The LabFour class which includes practice with getters and setters 
 *
 *@author    fohara
 */
 public class LabFour {
     // Instantiate private variables
     private String firstName;
     private String lastName;
     private int count;
     private double salary;
     
     // Accessor methods
     
     // Getters
     public String getFirstName() {
         return firstName;
     }
     
     public String getLastName() {
         return lastName;
     }
     
     public int getCount() {
         return count;
     }
     
     public double getSalary() {
         return salary;
     }
     
     // Setters
     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }
     
     public void setLastName(String lastName) {
         this.lastName = lastName;
     }
     
     public void setCount(int count) {
         this.count = count;
     } 
     
     public void setSalary(double salary) {
         this.salary = salary;
     }
     
     // Display everything methods
     public void displayEverything() {
         System.out.println(getFirstName());
         System.out.println(getLastName());
         System.out.println(getCount());
         System.out.println(getSalary());
     }
 }