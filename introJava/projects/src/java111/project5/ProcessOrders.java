package java111.project5;

import java.util.*;


/**
 *  The purpose of ProcessOrders is to create order objects and provide a means to run them
 *
 *@author    fohara
 *  To compile and run: run PizzaDriver.bat in project directory
 */
public class ProcessOrders {
    
   private ArrayList<Order> orders;
    
    /**
     *  The purpose of the placeOrders method is to create order objects
    */ 
    private void placeOrders() {
        
        orders = new ArrayList<Order>();
        
        orders.add(new OrderWithCharge("Frank", 1, "The Weedenator", 2, 22.50));
        orders.add(new Order("Olivia", 2, "Horcrux Juice", 9, 9.99));
        orders.add(new Order("Drizzt", 3, "Sun block", 1, 4.45));
        orders.add(new Order("Ivan", 4, "Not so terrible balm", 5, 42.50));
        orders.add(new OrderWithCharge("Elminster", 5, "Tank-in-a-box", 3, 2000.00));
    }
    
    /**
     *  The purpose of the run method is to supply a means to run the processing on the created orders
    */ 
    public void run() {
        
        placeOrders();
        
        for(Order o : orders) {
            o.runOrder();
        }
    }   
    
}