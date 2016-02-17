/**
 *  The testdrive class which runs DogLabTwo 
 *
 *@author    fohara
 */
 public class TestDogs {
    // Main method javadoc
    /**
     *  The main program for the [] class
     *
     *@param  args  The command line arguments
     */
     public static void main(String[] args) {
         // Instantiate and assign name to a DogLabTwo object
         DogLabTwo dog1 = new DogLabTwo();
         
         dog1.name = "Fido";
         
         // Instantiate and assign name to another DogLabTwo object
         DogLabTwo dog2 = new DogLabTwo();
         
         dog2.name = "Spot";
         
         // Make both dogs bark
         dog1.bark();
         dog2.bark();
         
         // Assign dog1 to dog2
         dog1 = dog2;
         
         dog1.bark();
         dog2.bark();
     }
 }