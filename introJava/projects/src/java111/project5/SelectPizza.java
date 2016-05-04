package java111.project5;

/**
 *  The purpose of this class is to run the demonstation of inherited constructors
 *
 *@author    fohara
 */
public class SelectPizza {
 
    /**
     *  The purpose of the processSelection method is to query the user for a size and print out the results
    */ 
    public void processSelection()
        
        /**
         *@throws java.lang.Exception with invalid user input
         */
        throws Exception {
        char         selection;
        String       choice      = "";
        int          i           = 0;
 
        System.out.print("Select a pizza size "
                 + "(Type 1 for S, 2 for M, 3 for L, 4 for X): ");
 
        selection = (char) System.in.read();
        choice = choice + selection;
        i = Integer.parseInt(choice) - 1;
 
        PizzaChoice  thisChoice  = new PizzaChoice(i);
 
        System.out.println(thisChoice);
    }
 
}