import java.lang.*;

public class Client {
    // This class holds the Client data variables and non-default class constructor
    

    // Variable Delclarations:
    String clientName;
    double lawnLength;
    double lawnWidth;
    int numPayments;
    double lawnArea;
    double clientPaymentTotal;
    double eachPayment;

    // Methods
    // New Client Constructor
    public Client(String name, String lawnLengthString, String lawnWidthString, String numPaymentsString) {
        clientName = name;
        lawnLength = Double.parseDouble(lawnLengthString);
        lawnWidth = Double.parseDouble(lawnWidthString);
        numPayments = Integer.parseInt(numPaymentsString);
        lawnArea = lawnLength * lawnWidth;
    }
}