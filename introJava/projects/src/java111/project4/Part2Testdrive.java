import java.util.*;

public class Part2Testdrive {
    
    public static void main(String[] args) {
        
        // Array Delclarations:
        ArrayList<StudentAbs> students = new ArrayList<StudentAbs>();
        InputHelper studentInput = new InputHelper();

        // Methods:
        
        // Use input to Generate Student list
        // Declare nextStudent sentinel
        String nextStudent = "y";
        int gradeLevel;
        
        // Loop through StudentInput until user inputs "n"
        while(nextStudent.equals("y")) {
            
            // ask for grade level each loop
            gradeLevel = Integer.parseInt(studentInput.getUserInput("Enter Student's grade level (0-12, 0 is equivelent to kindergarten):"));
            
            if(gradeLevel >= 0 && gradeLevel < 6) {
                students.add(new ElementarySchooler());
                students.get((students.size() - 1)).inputBuild(studentInput);
            } else if(gradeLevel >= 6 && gradeLevel < 9) {
                students.add(new MiddleSchooler());
                students.get((students.size() - 1)).inputBuild(studentInput);
            } else {
                students.add(new HighSchooler());
                students.get((students.size() - 1)).inputBuild(studentInput);
            }
            
            // Ask if they're done
            
            nextStudent = studentInput.getUserInput("Add another client? (y/n):");           
        }
        
        // print out students
        for(StudentAbs s : students ) {
            s.run();
        }
    }
}