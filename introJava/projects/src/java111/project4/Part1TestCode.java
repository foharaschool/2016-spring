public class Part1TestCode {
    public static void main(String[] args) {
        
        // Test Student
        private boolean studentTest() {
            Student aStudent = new student();
            String result = aStudent;
            String isSuccess;
            
            if(result == "Student id: 1010\nStudent name: Frank\nSchool: RP\nExtracurriculars: football\n"
                    + "Homeroom teacher: Ms. Mary") {
                isSuccess = "Pass";
            } else {
                isSuccess = "Fail";
            }
            return isSuccess;
        }
        
        // Test Kindergartener
        private boolean kindergartenerTest() {
            Kindergartener aKindergartener = new Kindergartener();
            String result = aKindergartener;
            boolean isSuccess;
            
            if(result == "Student id: 1010\nStudent name: Frank\nSchool: RP\nExtracurriculars: football\n"
                    + "Homeroom teacher: Ms. Mary\nShow and tell item: Rock") {
                isSuccess = "Pass";
            } else {
                isSuccess = "Fail";
            }
            return isSuccess;
        }
        
        // output results
        System.out.println("Student Object Test: " + studentTest());
        System.out.println("Student Object Test: " + kindergartenerTest());
    }
}