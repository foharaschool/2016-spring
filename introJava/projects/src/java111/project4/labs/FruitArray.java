import java.util.*;

public class FruitArray {
    // Instantiate Arraylist
    public ArrayList<Fruit> fruitBasket = new ArrayList<Fruit>();
    FruitSlicer knife = new FruitSlicer();
    
    public void displayArray() {
        for(Fruit aFruit : fruitBasket) {
        aFruit.displayClassName();
        knife.slice(aFruit);
        }
    }
}