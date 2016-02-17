/**
 *  The LabFiveTestDrive class 
 *
 *@author    fohara
 */
 public class LabFiveTestDrive {
     
     /**
     *  The main program for the LabFive class
     *
     *@param  args  The command line arguments
     */
     public static void main(String[] args) {
         LabFive findPerson = new LabFive();
         
         // Call methods to setup and loop array
         findPerson.setup();
         findPerson.runWhile();
         findPerson.runFor();
         
         
     }
 }