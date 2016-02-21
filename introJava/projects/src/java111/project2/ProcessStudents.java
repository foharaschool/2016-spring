// Class for creating Student objects and displaying them
public class ProcessStudents {
    // Inst var
    private Student[] studentGroup;
    
    // Method to create array of Student objects
    private void createStudents() {
        studentGroup = new Student[3];
        
        // Instantiate Student objects in studentGroup array
        for(int i = 0; i < studentGroup.length; i++) {
            studentGroup[i] = new Student();
        }
        
        // Student object value assignments
        // Names
        studentGroup[0].setStudName("Franklin");
        studentGroup[1].setStudName("Artimis");
        studentGroup[2].setStudName("Drizzt");
        
        // Ids
        studentGroup[1].setStudId(98765);
        studentGroup[2].setStudId(23456);
        
        // Credit Hours
        studentGroup[1].setCredHours(24);
        studentGroup[2].setCredHours(36);
        
        // Grade Points
        studentGroup[1].setGradePoints(39);
        studentGroup[2].setGradePoints(144);
    }
    // Method to display Student objects
    public void displayStudents() {
        for(int i = 0; i < studentGroup.length; i++) {
            studentGroup[i].display();
        }
    }
        
    // Method for processing create and display methods
    public void runStudentProcessing() {
        createStudents();
        displayStudents();
    }
}