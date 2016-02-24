// Testdrive class for QuessNumber class
public class GuessNumberTestDrive {
    public static void main(String[] args) {
        // Initialize test number and instantiate class for testing   
        int randomNumberTest = 50;
        GuessNumber testGuesser - new GuessNumber;
        
        // Test too low
        testGuesser.userNum = 45;
        
        testGuesser.randomCompare();
        
        if(testGuesser.fail == "too low") {
            System.out.println("Too low test: success");
        } else {
            System.out.println("Too low test: failure");
        }
    }
}