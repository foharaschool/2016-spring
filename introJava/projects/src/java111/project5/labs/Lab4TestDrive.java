package java111.project5.labs;

import java.lang.Math.*;

public class Lab4TestDrive {
    
    public static void main(String[] args) {
        
        double randomNumber = Math.random() * 1000;
        double randomNumber2 = Math.random() * 1000;
        double randomNumber3 = Math.random() * 1000;
        
        
        System.out.println("Random Number:" + randomNumber);
        
        System.out.println("Square root of " + randomNumber + "is " + Math.sqrt(randomNumber));
        System.out.println("Square root of " + randomNumber2 + "is " + Math.sqrt(randomNumber2));
        System.out.println("Square root of " + randomNumber3 + "is " + Math.sqrt(randomNumber3));
        
        System.out.println("Rounded int of " + randomNumber + "is " + Math.ceil(randomNumber));
        System.out.println("Rounded int of " + randomNumber2 + "is " + Math.ceil(randomNumber2));
        System.out.println("Rounded int of " + randomNumber3 + "is " + Math.ceil(randomNumber3));
        
        System.out.println("Rounded tenth of " + randomNumber + "is " + (Math.ceil(randomNumber * 100) / 100));
        System.out.println("Rounded tenth of " + randomNumber2 + "is " + (Math.ceil(randomNumber2 * 100) / 100));
        System.out.println("Rounded tenth of " + randomNumber3 + "is " + (Math.ceil(randomNumber3 * 100) / 100));
        
        System.out.println("PI times 21: " + Math.PI * 21);
    }
}