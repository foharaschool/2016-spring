package java111.project5;

import java.text.*;
import java.util.*;
 
/**
 *  The PizzaChoice class which sets sizes, prices and formats the prices to currency format
 *
 *@author    fohara
 */ 
public class PizzaChoice {
    private  char[]        sizes   = {'S', 'M', 'L', 'X'};
    private  double[]      prices  = {6.99, 8.99, 12.50, 15.00};
    private  NumberFormat  nf      = NumberFormat.getCurrencyInstance();
    private  int           i;
     
    /**
     *  The purpose of this method is to set the size to passed value
     *@param    x   represents user entered size choice
    */ 
    public PizzaChoice(int x) {
        i = x;
    }
    
    /**
     *  The purpose of this method is to get the size (X)
     *@return   returns stored size to calling methods
    */  
    public char getSize() {
        return sizes[i];
    }
     
     /**
     *  The purpose of this method is to get the price
     *@return   returns stored price to calling methods
    */ 
    public double getPrice() {
        return prices[i];
    }
    
    /**
     *  The purpose of this method is to return a custom selection message
     *@return   Returns formatted result output to user
    */ 
    public String toString() {
        StringBuffer  sb  =
                new StringBuffer("You have selected a pizza size ");
        sb.append(sizes[i] + "\nThe price is ");
        sb.append(nf.format(prices[i]));
        return sb.toString();
    }
}