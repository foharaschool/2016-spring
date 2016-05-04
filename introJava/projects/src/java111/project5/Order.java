

public class Order {
    
    protected String customerName;
    protected int customerNumber;
    protected String prodName;
    protected int quantity;
    protected double unitPrice;
    
    public Order(String customerName, int customerNumber, String prodName, int quantity, double unitPrice) {
        
        this.customerName = customerName;
        this.customerNumber = customerNumber;
        this.prodName = prodName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    
    public void orderTotal() {
        
        double total = quantity * unitPrice;
        
        thisString();
    }
    
    public String thisString() {
        return "Customer: " + customerName
                + "\nItem Ordered: " + prodName
                + "\nUnit Price: " + unitPrice
                + "\nQuantity: " + quantity
                + "\nTotal: " + total
                + "\n";
    }
    
}