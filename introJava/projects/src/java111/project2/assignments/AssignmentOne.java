public class AssignmentOne {
    // Add instance variables
    int counter = 10;
    double additionValue = 12.76;
    double calculatedAmount;
    
    // Loops through a set count number of times to add the add variable to the calculated amout
    void runLoop() {
        calculatedAmount = 0;
        while(counter > 0) {
            calculatedAmount += additionValue;
            counter--;
        }
        System.out.println("Calculated total: " + calculatedAmount);
    }
}