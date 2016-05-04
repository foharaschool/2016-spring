package java111.project5;

/**
 *  The Project5TestDrive class runs the processed orders that were colleced in the ProcessOrders Class
 *
 *@author    fohara
 *  To compile and run:
 *  javac -classpath classes -d classes src/java111/project5/*.java
 *  java -classpath classes java111.project5.Project5TestDrive
 */
public class Project5TestDrive {
    
    /**
     *  The main program for the Project5TestDrive class.
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
        
        ProcessOrders collectOrders =  new ProcessOrders();
        
        collectOrders.run();
    }
}