public class Part1TestCode {
     // Test Student
        static String studentTest() {
            Student aStudent = new Student();
            String result;
            String isSuccess;
            
            aStudent.setStudentId(1010);
            aStudent.setName("Frank");
            aStudent.setSchool("RP");
            aStudent.setExtracurriculars("football");
            aStudent.setHomeroomTeacher("Ms. Mary");
            
            result = aStudent.toString();
            
            System.out.println(result);
            System.out.println(aStudent.toString());
            
            if(result.equals("Student id: 1010\nStudent name: Frank\nSchool: RP\nExtracurriculars: football\n"
                    + "Homeroom teacher: Ms. Mary")) {
                isSuccess = "Pass";
            } else {
                isSuccess = "Fail";
            }
            return isSuccess;
        }
        
        // Test Kindergartener
        static String kindergartenerTest() {
            Kindergartener aKindergartener = new Kindergartener();
            String result;
            String isSuccess;
            
            aKindergartener.setStudentId(1010);
            aKindergartener.setName("Frank");
            aKindergartener.setSchool("RP");
            aKindergartener.setExtracurriculars("football");
            aKindergartener.setHomeroomTeacher("Ms. Mary");
            aKindergartener.setShowAndTell("Rock");
            
            result = aKindergartener.toString();
            
            System.out.println(result);
            System.out.println(aKindergartener.toString());
            
            if(result.equals("Student id: 1010\nStudent Name: Frank\nSchool: RP\nExtracurriculars: football\n"
                    + "Homeroom Teacher: Ms. Mary\nShow and Tell Item: Rock\n")) {
                isSuccess = "Pass";
            } else {
                isSuccess = "Fail";
            }
            return isSuccess;
        }
    
    public static void main(String[] args) {
        
        // output results
        System.out.println("Student Object Test: " + studentTest());
        System.out.println("Kindergartener Object Test: " + kindergartenerTest());
    }
}