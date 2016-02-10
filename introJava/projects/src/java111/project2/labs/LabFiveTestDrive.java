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
         findPerson.setup();
         
         findPerson.people[0].displayEverything();
     }
 }