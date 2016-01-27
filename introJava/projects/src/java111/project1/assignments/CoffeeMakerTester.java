/**
 *  The CoffeeMaker class which will make strong and weak coffee
 *
 *@author    fohara
 */
public class CoffeeMakerTester {
     
     /**
     *  The main program for the CoffeeMaker class.
     *
     *@param  args  The command line arguments
     */
     public static void main(String[] args) {
         CoffeeMaker makesSomeCoffee = new CoffeeMaker();

         makesSomeCoffee.makeStrongCoffee();
         makesSomeCoffee.makeWeakCoffee();
     }
}