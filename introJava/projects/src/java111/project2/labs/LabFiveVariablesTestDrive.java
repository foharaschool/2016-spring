/**
 *  The testdrive class for LabFiveVariables 
 *
 *@author    fohara
 */
 public class LabFiveVariablesTestDrive {
     // Main method javadoc
    /**
     *  The main program for the LabFiveVariables class
     *
     *@param  args  The command line arguments
     */
     // Instantiate a LabFiveVariables object
     public static void main(String[] args) { 
     LabFiveVariables countStuff = new LabFiveVariables();
     
     countStuff.run();
     
     System.out.println(countStuff.getCount());
     }
 }