public class ElementarySchooler extends StudentAbs implements TestTaker  {
    
    private int numShoesOn;
    
    // Specific methods
    
    public void inputBuild(InputHelper studentInput){
        super.inputBuild(studentInput);
        numShoesOn = Integer.parseInt(studentInput.getUserInput("Number of shoes they're wearing:"));
    }
    
    public String canLineUp() {
        
        return name + " has " + numShoesOn + " shoe(s) on. Can (s)he line up yet?\n";
    }
    
    // toString override
    public String toString() {
        
        String studentString = super.toString();
        
        studentString += canLineUp();
        
        return studentString;
    }
    
    public String getTestResults() {
        return name + " Took 15 coloring tests at " + school + " and received a final grade of Needs Improvement.\n";
    }
    
    public void takeTest() {
        System.out.println(getTestResults());
    }
    
    public void run() {
        System.out.println(toString());
        takeTest();
    }
}