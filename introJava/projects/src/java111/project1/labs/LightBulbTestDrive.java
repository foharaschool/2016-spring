/**
 *  This is the test drive class for light bulbs
 *
 *@author    eknapp
 */
public class LightBulbTestDrive {
 
    /**
     *  The main program for the LightBulbTestDrive class
     *
     *@param  args  The command line arguments
     */
    public static void main(String[] args) {
         
        LightBulb dim = new LightBulb();
        LightBulb bright = new LightBulb();
         
        dim.turnOn();
        dim.turnOff();
         
        bright.turnOn();
        bright.turnOff();
         
    }
 
}