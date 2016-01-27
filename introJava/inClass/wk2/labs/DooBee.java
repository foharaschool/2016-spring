/**
 *  Part of Lab 2
 *
 *@author    eknapp
 */
public class DooBee {
 
    /**
     *  The main program for the DooBee class
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
        int  x  = 1;
        while (x < 3) {
            System.out.println("Doo");
            System.out.println("Bee");
            x++;
        }
        if (x == 3) {
            System.out.println("Do");
        }
    }
}