public class Lab1Testdrive {
    public static void main(String[] args) {
        // Main method for the lab 1 testdrive
        
        // Shoe object
        Footwear sneaker = new Footwear();
        sneaker.setShoeSize(12);
        sneaker.setShoeColor("Blue");
        sneaker.setShoeLaces(true);
        
        // Boot object
        Boot cowboy = new Boot();
        cowboy.setShoeSize(11);
        cowboy.setShoeColor("Orange");
        cowboy.setShoeLaces(false);
        cowboy.setBootHeight(5);
        
        // Call display
        sneaker.displayShoe();
        System.out.println("");
        cowboy.displayShoe();
    }
}