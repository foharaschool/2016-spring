// Class which holds data and methods in regards to invoice items
public class InvoiceItem {
    private int itemId;
    private int itemQuantity = 0;
    private double itemPrice = 0.0;
    private String itemDescription;
    
    // Accessor methods
    // Setters
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    
    // Getters
    public int getItemId() {
        return itemId;
    }
    
    public int getItemQuantity() {
        return itemQuantity;
    }
    
    public double getItemPrice() {
        return itemPrice;
    }
    
    public String getItemDescription() {
        return itemDescription;
    }
    
    // Method to calculate item total
    public double calculateItemTotal() {
        return itemQuantity * itemPrice;
    }
    
    // Method to display object data and calculations
    public String display() {
        return "Quantity: " + itemQuantity + ", Price: $" + itemPrice
                + ", Description: " + itemDescription + ", Total Cost: $" + calculateItemTotal();
    }
}