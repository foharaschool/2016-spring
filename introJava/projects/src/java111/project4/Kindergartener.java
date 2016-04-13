public class Kindergartener extends Student {
    
    // Kindergartener specific variable
    protected String showAndTell;
    
    // Getter and Setter
    public String getShowAndTell() {
        return showAndTell;
    }
    
    public void setShowAndTell(String showAndTell) {
        this.showAndTell = showAndTell;
    }
    
    // toString override
    public String toString() {
        
        // collect the super
        String studentString = super.toString();
        
        studentString += "Show and Tell Item: " + showAndTell + "\n";
        
        return studentString;
    }
}