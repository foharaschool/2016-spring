public class Lab3_4Testcode {
    // Main method for test class driver
    public static void main(String[] args) {       
        
        // Instantiate objects for testing
        GuessNumber testGuess = new GuessNumber();
        RandomNum testRandom = new RandomNum();
        CompareNumber testCompare = new CompareNumber();
        
        // Test the compare method to return success
        testCompare.guess = 45;
        testCompare.randomNum = 45;
        
        testCompare.randomCompare();
        if(testCompare.output.equals("Guess matches the random number.")) {
            System.out.println("Compare success test passed");
        } else {
            System.out.println("Compare success test failure");
        }
        
        // Test the compare method to return high failure
        testCompare.guess = 47;
        testCompare.randomNum = 45;
        testCompare.randomCompare();
        if(testCompare.output.equals("Guess is too high.")) {
            System.out.println("Compare fail high test passed");
        } else {
            System.out.println("Compare fail high test failure");
        }
        
        // Test the compare method to return low failure
        testCompare.guess = 42;
        testCompare.randomNum = 45;
        
        testCompare.randomCompare();
        if(testCompare.output.equals("Guess is too low.")) {
            System.out.println("Compare fail low test passed");
        } else {
            System.out.println("Compare fail low test failure");
        }
    }
}