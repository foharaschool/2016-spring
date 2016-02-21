// Class to create invoice object arrays and set invoice items
public class ProcessInvoice {
    // Inst var
    Invoice pizzaHut;
    
    // Method to create invoice items
    private void createInvoiceItems() {
        // create local array
        InvoiceItem[] pizza = new InvoiceItem[3];
        
        // Instantiate Invoice Item objects
        pizza[0] = new InvoiceItem();
        pizza[1] = new InvoiceItem();
        pizza[2] = new InvoiceItem();
        
        // Set InvoiceItem vars
        pizza[0].setItemId(1);
        pizza[1].setItemId(2);
        pizza[2].setItemId(3);
        
        pizza[0].setItemQuantity(4);
        pizza[1].setItemQuantity(2);
        pizza[2].setItemQuantity(1);
        
        pizza[0].setItemPrice(7.99);
        pizza[1].setItemPrice(14.50);
        pizza[2].setItemPrice(5.99);
        
        pizza[0].setItemDescription("Small Pepperoni Pizza");
        pizza[1].setItemDescription("Large Sausage Pizza");
        pizza[0].setItemDescription("Breadsticks");
        
        // Place into invoice
        pizzaHut.setBill(pizza);
    }
    
    public void runProcess() {
        // Instantiate new invoice object
        pizzaHut = new Invoice();
        
        // Create, calculate, and display invoice
        createInvoiceItems();
        pizzaHut.calculateInvoice();
        pizzaHut.display();
        
    }
    
}