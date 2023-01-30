//import of package
import java.util.ArrayList;
public class BookStore {
    //the message has been provided for you - do not change this
    private final String message = "The urgent orders are piling up .... time to ship quicker";

    //create the invoices ArrayList<>
    private ArrayList <Invoice> invoices;

    //complete the constructor
    public BookStore () {
        this.invoices = new ArrayList<>();
    }



    //getter() for invoices list

     public ArrayList <Invoice> getInvoices(){
        return invoices;
     }

    //search for an order
    public Invoice searchOrder(String invoiceNbr){
    for(Invoice object : invoices){
        if (object.getInvoiceNbr().equals(invoiceNbr)){
            return object;
        }
    }
    return  null;
    }


    //piling up of orders
    public String pilingUpOfOrders() {
        if(Shipping.countUrgent > 5) {
            return message;
        }
        else {
            return null;
        }
    }



}
