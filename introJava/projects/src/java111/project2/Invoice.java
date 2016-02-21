// Class for defining and grouping InvoiceItem objects
public class Invoice {
    // Inst vars
    private InvoiceItem[] bill;
    private double invoiceTotal;
    
    // Getter for invoiceTotal
    public double getInvoiceTotal() {
        return invoiceTotal;
    }
    
    // Setter for bill array
    public void setBill(InvoiceItem[] bill) {
        this.bill = bill;
    }
    
    // Gather total of all items in bill
    public void calculateInvoice() {
        for(int i = 0; i < bill.length; i++) {
            invoiceTotal += bill[i].calculateItemTotal();
        }
    }
    
    // Method to display invoice 
    public void display() {
        for(int i = 0; i < bill.length; i++) {
            System.out.println(bill[i].display());            
        }
        System.out.println("Invoice Total: $" + invoiceTotal);
    }
    
}