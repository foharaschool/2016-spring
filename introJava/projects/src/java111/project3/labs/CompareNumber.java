// Class for comparing a user number to a randomly generated number
public class CompareNumber {
    // Declare Variables
    boolean success = false;
    String output = "";
    
    // Instantiate GuessNumber and RandomNum objects
    GuessNumber userGuess = new GuessNumber();
    RandomNum randNum = new RandomNum();
    
    // Store user and random numbers
    int guess = userGuess.userNum;
    int randomNum = randNum.randomInt;
    
    
    // Methods
    
    // Compare the user number to the random number
    public void randomCompare() {
        if(guess < randomNum) {
            output = "Guess is too low.";
        } else if(guess > randomNum) {
            output = "Guess is too high.";
        } else {
            output = "Guess matches the random number.";
            success = true;
        }
    }
    
    // Output message
    public void printOutput() {
        System.out.println(output);        
    }
    
    // Run method for class
    public void run() {
        while(!success) {
            // userGuess.prompt();
            randomCompare();
            printOutput();
        }
    }
}