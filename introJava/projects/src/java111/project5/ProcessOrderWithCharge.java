

public class ProcessOrderWithCharge extends Order {
    
    private double handlingCharge;
    
    public ProcessOrderWithCharge(double handlingCharge) {
        super(customerName, customerNumber, prodName, quantity, unitPrice);
        
    }
}