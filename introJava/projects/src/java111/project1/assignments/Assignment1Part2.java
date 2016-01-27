/**
 * This is a class for printing out based on count
 *
 * @author  fohara
 */
public class Assignment1Part2 {
    
    /**
     * The main program for the Assigment1Part2 class
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
        
        int counter = 0;
        
        while(counter < 10) {
            
            if(counter == 0) {
                System.out.println("First time!");
            }
            
            if(counter == 4) {
                System.out.println("Half-way there");
            }
            
            if(counter == 9) {
                System.out.println("All done!");
            }
            counter++;
        }
    }
}