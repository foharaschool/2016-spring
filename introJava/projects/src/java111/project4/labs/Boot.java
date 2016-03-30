public class Boot extends Footwear {
    // Boot specific variables
    private int bootHeight;
    
    // Getter and Setter
    public void setBootHeight(int bootHeight) {
        this.bootHeight = bootHeight;
    }
    
    public int getBootHeight() {
        return bootHeight;
    }
    
    // override displayShoe
    public void displayShoe() {
        System.out.println("Boot Size: " + shoeSize + "\n"
                + "Boot Color: " + shoeColor + "\n"
                + "Has Laces?: " + shoeLaces + "\n"
                + "Boot height: " + bootHeight);
    }
}