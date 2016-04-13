public class MiddleSchooler extends StudentAbs implements TestTaker {
    
    private int numMoodSwings;
    
    // Specific Methods
    
    public void inputBuild(InputHelper studentInput){
        super.inputBuild(studentInput);
        numMoodSwings = Integer.parseInt(studentInput.getUserInput("Number of mood swings:"));
    }
    
    public String pubertyComplete() {
        
        return name + " has had " + numMoodSwings + " mood swings this week.\n";
    }
    
    public String toString() {
        String studentString = super.toString();
        
        studentString += pubertyComplete();
        
        return studentString;
    }
    
    public String getTestResults() {
        return name + " Took 22 tests at " + school + " and received a final grade of D\n";
    }
    
    public void takeTest() {
        System.out.println(getTestResults());
    }
    
    public void run() {
        System.out.println(toString());
        takeTest();
    }
}