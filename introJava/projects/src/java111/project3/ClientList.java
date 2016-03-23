import java.util.*;
// The purpose of this class is to create client objects based off of input
// and print out reports
public class ClientList {

    // Array Delclarations:
    ArrayList<Client> clientele = new ArrayList<Client>();
    InputHelper clientData = new InputHelper();

    // Methods:
    
    // Use input to Generate client list
    public void buildClients() {
        
        // Declare nextClient sentinel
        String nextClient = "y";
        
        // Loop through clientInput until user inputs "n"
        while(nextClient.equals("y")) {
            // Client vars - reset each loop
            String name = clientData.getUserInput("Client Name:");
            String lengthLawn = clientData.getUserInput("Length of lawn:");
            String widthLawn = clientData.getUserInput("Width of lawn:");
            String payNum = clientData.getUserInput("Number of Payments:");
            nextClient = clientData.getUserInput("Add another client? (y/n):");
            
            // Store in new Client object
            clientele.add(new Client(name, lengthLawn, widthLawn, payNum));
        }
    }

    // Report methods
    
    public void clientCalculations() {
        // calculation variables
        int mowingSeason = 20;
        
        // Access clientele to calculate and print client report
        for(Client client : clientele) {
            
            // Calculate total of all payments based on size charge and num payments surcharge
            if(client.numPayments == 1 && client.lawnArea < 400) {
                client.clientPaymentTotal = (25 * 20);
                client.eachPayment = client.clientPaymentTotal;
            } else if(client.numPayments == 1 && (client.lawnArea > 400 && client.lawnArea < 600)) {
                client.clientPaymentTotal = (35 * 20);
                client.eachPayment = client.clientPaymentTotal;
            } else if(client.numPayments == 1 && client.lawnArea >= 600) {
                client.clientPaymentTotal = (50 * 20);
                client.eachPayment = client.clientPaymentTotal;
            } else if(client.numPayments == 2 && client.lawnArea < 400) {
                client.clientPaymentTotal = (25 * 20) + 10;
                client.eachPayment = client.clientPaymentTotal / 2;
            } else if(client.numPayments == 2 && (client.lawnArea > 400 && client.lawnArea < 600)) {
                client.clientPaymentTotal = (35 * 20) + 10;
                client.eachPayment = client.clientPaymentTotal / 2;
            } else if(client.numPayments == 2 && client.lawnArea >= 600) {
                client.clientPaymentTotal = (50 * 20) + 10;
                client.eachPayment = client.clientPaymentTotal / 2;
            } else if(client.numPayments == 20 && client.lawnArea < 400) {
                client.clientPaymentTotal = (25 * 20) + 60;
                client.eachPayment = client.clientPaymentTotal / 2;
            } else if(client.numPayments == 20 && (client.lawnArea > 400 && client.lawnArea < 600)) {
                client.clientPaymentTotal = (35 * 20) + 60;
                client.eachPayment = client.clientPaymentTotal / 2;
            } else if(client.numPayments == 20 && client.lawnArea >= 600) {
                client.clientPaymentTotal = (50 * 20) + 60;
                client.eachPayment = client.clientPaymentTotal / 2;
            }
        }
    }
    
    
    
    // Print Client Report
    public void clientReport() {
        System.out.println("");
        System.out.println("");
        System.out.println("*****Client Report*****");
        for(Client client : clientele) {
            System.out.println("");
            System.out.println("Client: " + client.clientName);
            System.out.println("Lawn Size: " + client.lawnArea + " sq. ft.");
            System.out.println("Number of payments: " + client.numPayments);
            System.out.println("Amount of each payment: $" + client.eachPayment);
            System.out.println("Total of all payments: $" + client.clientPaymentTotal);            
        }
        System.out.println("*****END OF CLIENT REPORT*****");
    }
    
    public void summaryReport() { 
        // Summary variables
        int numClients = clientele.size();
        double totalSquareFootage = 0;
        double totalRevenue = 0;
        
        for(Client client : clientele) {
            // Calculate Total sq footage
            totalSquareFootage += client.lawnArea;
            
            // Calcualte Total Revenue
            totalRevenue += client.clientPaymentTotal;
        }
        
        // Print Summary Report
        System.out.println("");
        System.out.println("");
        System.out.println("*****Summary Report*****");
        System.out.println("Total number of clients: " + numClients);
        System.out.println("Total square feet of mowing: " + totalSquareFootage);
        System.out.println("Total revenue for the summer: $" + totalRevenue);
        System.out.println("*****END OF SUMMARY REPORT*****");
    }
    
    public void run() {
        buildClients();
        clientCalculations();
        clientReport();
        summaryReport();
    }
}