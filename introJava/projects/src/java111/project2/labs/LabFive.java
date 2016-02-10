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
         

     }
     
 }