// Fill out this comment
public class Student {
    // Inst vars
    private String studName = "John";
    private int studId = 99999;
    private int credHours = 45;
    private int gradePoints = 100;
    
    // Accessor Methods
    
    // Getters
    public String getStudName() {
        return studName;
    }
    
    public int getStudId() {
        return studId;
    }
    
    public int getCredHours() {
        return credHours;
    }
    
    public int getGradePoints() {
        return gradePoints;
    }
    
    // Setters
    public void setStudName(String studName) {
        this.studName = studName;
    }
    
    public void setStudId(int studId) {
        this.studId = studId;
    }
    
    public void setCredHours(int credHours) {
        this.credHours = credHours;
    }
    
    public void setGradePoints(int gradePoints) {
        this.gradePoints = gradePoints;
    }
    
    // GPA method
    public double gpa() {
        return gradePoints / (double)credHours;
    }
    
    // Display method
    public void display() {
        System.out.println("Student Name: " + studName);
        System.out.println("Student ID: " + studId);
        System.out.println("Student credit hours: " + credHours);
        System.out.println("Student grade points: " + gradePoints);
        System.out.println("Student grade point average: " + gpa());
    }
}