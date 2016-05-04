package java111.project5;

/**
 *  The purpose of this class is to run the demonstation of inherited constructors
 *
 *@author    fohara
 *  To compile and run: run PizzaDriver.bat in project directory
 */
public class PizzaDriver {
 
    /**
     *  The main program for the PizzaDriver class.
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args)
        
        /**
         *@throws java.lang.Exception with invalid user input
         */
        throws Exception {
 
        SelectPizza  thisPizza  = new SelectPizza();
        thisPizza.processSelection();
    }
}