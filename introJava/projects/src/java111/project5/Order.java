package java111.project5;

/**
 *  The purpose of this class is to run the demonstation of inherited constructors
 *
 *@author    fohara
 *  To compile and run: run PizzaDriver.bat in project directory
 */
public class Order {
    
    protected String customerName;
    protected int customerNumber;
    protected String prodName;
    protected int quantity;
    protected double unitPrice;
    protected double total;
    
    /**
     *  Constructor for the Order object
     *@param    customerName This is the customer's name
     *@param    customerNumber  A customer number, mocking a Unique key
     *@param    prodName    The name of the product
     *@param    quantity    The quantity being sold of one product
     *@param    unitPrice   The cost per product unit
    */ 
    public Order(String customerName, int customerNumber, String prodName, int quantity, double unitPrice) {
        
        this.customerName = customerName;
        this.customerNumber = customerNumber;
        this.prodName = prodName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    
    /**
     *  The purpose of the orderTotal method is to calculate the order total
    */
    protected void orderTotal() {
        
        total = quantity * unitPrice;
        
    }
    
    /**
     *  The purpose of the runOrder method is to call the orderTotal method and print the output message
    */
    public void runOrder() {
        orderTotal();
        System.out.println(thisString());
    }
    
    /**
     *  The purpose of the thisString method is to generate a message to output values
     *@return   formated output string of Order instance variables
    */
    protected String thisString() {
        return "Customer: " + customerName
                + "\nItem Ordered: " + prodName
                + "\nUnit Price: $" + unitPrice
                + "\nQuantity: " + quantity
                + "\nTotal: $" + total
                + "\n";
    }
    
}