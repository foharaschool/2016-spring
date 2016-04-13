public class HighSchooler extends StudentAbs implements TestTaker {
    
    private int numFrogs;
    
    // HighSchooler methods
    
    public void inputBuild(InputHelper studentInput){
        super.inputBuild(studentInput);
        numFrogs = Integer.parseInt(studentInput.getUserInput("Number of Frogs dissected:"));
    }
    
    
    public String dissectedFrog() {
        
            return name + " has dissected " + numFrogs + " frogs.\n";
    }
    
    public String getTestResults() {
        return name + " Took 10 tests at " + school + " and received a final grade of B+\n";
    }
    
    public void takeTest() {
        System.out.println(getTestResults());
    }
    
    public String toString() {
        
        String studentString = super.toString();
        
        studentString += dissectedFrog();
        
        return studentString;
    }
    
    public void run() {
        System.out.println(toString());
        takeTest();
    }
}