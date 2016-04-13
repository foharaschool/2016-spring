import java.util.*;

public abstract class StudentAbs {
    
    // Inst vars
    protected int studentId;
    protected String name;
    protected String school;
    protected String extracuriculars;
    protected String homeroomTeacher;

    // input assignments
    public void inputBuild(InputHelper studentInput){
        studentId = Integer.parseInt(studentInput.getUserInput("Student ID:"));
        name = studentInput.getUserInput("Student Name:");
        school = studentInput.getUserInput("School:");
        extracuriculars = studentInput.getUserInput("Extracurriculars:");
        homeroomTeacher = studentInput.getUserInput("Homeroom Teacher:");
    }
    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSchool() {
        return school;
    }
    
    public String getExtracurriculars() {
        return extracuriculars;
    }
    
    public String getHomeroomTeacher() {
        return homeroomTeacher;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSchool(String school) {
        this.school = school;
    }
    
    public void setExtracurriculars(String extracuriculars) {
        this.extracuriculars = extracuriculars;
    }
    
    public void setHomeroomTeacher(String homeroomTeacher) {
        this.homeroomTeacher = homeroomTeacher;
    }
    
    // Class methods
    public String toString() {
        
        // Build student string
        String studentString = "Student ID: " + studentId + "\n"
                + "Student Name: " + name + "\n"
                + "School: " + school + "\n"
                + "Extracurriculars: " + extracuriculars + "\n"
                + "Homeroom Teacher: " + homeroomTeacher + "\n";
                
        return studentString;
    }
    
    public void run(){}
}