// Class for Lab six: calculations in Java
public class LabSix {
    // Method for what I assume will be doing math
    public void run() {
        // Delcare local vars
        int var1 = 5;
        int var2 = 10;
        int var3 = 3;
        int var4 = 25;
        int intResults = 0;
        double dblResults = 0.0;
        
        // Add
        intResults = var1 + var2 + var3 + var4;
        
        // Display Addition
        System.out.println(intResults);
        
        // multiply and divide
        dblResults = (var1 * var2 * var4) / (double)var3;
        
        // Output multiply and divide
        System.out.println(dblResults);
    }
}