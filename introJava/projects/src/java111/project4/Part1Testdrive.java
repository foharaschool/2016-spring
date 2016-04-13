// Testdrive class for Proj4 part 1
public class Part1Testdrive {
    // Main method
    public static void main(String[] args) {
        
        // Instantiate Student object and set vars
        Student aStudent = new Student();
        aStudent.setStudentId(352);
        aStudent.setName("Fran");
        aStudent.setSchool("Willow High");
        aStudent.setExtracurriculars("Football");
        aStudent.setHomeroomTeacher("Ms. Maisy");
        
        // Kindergartener
        Kindergartener aKindergartener = new Kindergartener();
        aKindergartener.setStudentId(115);
        aKindergartener.setName("Winnie");
        aKindergartener.setSchool("Oak Crest Elementary");
        aKindergartener.setExtracurriculars("Coloring Corner");
        aKindergartener.setHomeroomTeacher("Mr. Johnson");
        aKindergartener.setShowAndTell("Ear Trumpet");
        
        // Print Student and Kindergartener
        System.out.println(aStudent.toString());
        System.out.println(aKindergartener.toString());
        
        
        
    }
}