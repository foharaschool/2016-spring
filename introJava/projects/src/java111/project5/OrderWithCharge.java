package java111.project5;

/**
 *  The purpose of this class is to run the demonstation of inherited constructors
 *
 *@author    fohara
 *  To compile and run: run PizzaDriver.bat in project directory
 */
public class OrderWithCharge extends Order {
    
    private double handlingCharge;
    private double totalWithHandling;
    
    /**
     *  Constructor for the OrderWithCharge object
     *@param    customerName This is the customer's name
     *@param    customerNumber  A customer number, mocking a Unique key
     *@param    prodName    The name of the product
     *@param    quantity    The quantity being sold of one product
     *@param    unitPrice   The cost per product unit
    */ 
    public OrderWithCharge(String customerName, int customerNumber, String prodName, int quantity, double unitPrice) {
        super(customerName, customerNumber, prodName, quantity, unitPrice);
    }
    
    /**
     *  The purpose of the orderTotal method is to calculate the order total add a handling charge to the order total based on quantity criteria
    */
    protected void orderTotal() {
        
        super.orderTotal();
        
        if(quantity > 0 && quantity < 4) {
            handlingCharge = 4;
        } else if(quantity > 3 && quantity < 7) {
            handlingCharge = 5;
        } else if(quantity > 6 && quantity < 10) {
            handlingCharge = 6;
        } else if(quantity > 9) {
            handlingCharge = 7;
        }
        
        totalWithHandling = handlingCharge + total;
    }
    
    
    /**
     *  The purpose of the thisString method is to generate a message to output values
     *@return   formated output string of Order instance variables
    */
    protected String thisString() {
        return super.thisString()
                + "Plus a $" + handlingCharge + " handling charge"
                + "\nTotal with Handling: $" + totalWithHandling + "\n";
    }
    
}