public class Footwear {
    // Instance variables
    protected int shoeSize;
    protected String shoeColor;
    protected boolean shoeLaces;
    
    // Getters and setters
    public int getShoeSize() {
        return shoeSize;
    }
    
    public String getShoeColor() {
        return shoeColor;
    }
    
    public boolean getShoeLaces() {
        return shoeLaces;
    }
    
    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }
    
    public void setShoeColor(String shoeColor) {
        this.shoeColor = shoeColor;
    }
    public void setShoeLaces(boolean shoeLaces) {
        this.shoeLaces = shoeLaces;
    }
    
    // Display method
    public void displayShoe() {
        System.out.println("Size: " + shoeSize + "\n"
                + "Color: " + shoeColor + "\n"
                + "Has Laces?: " + shoeLaces);
    }
}

