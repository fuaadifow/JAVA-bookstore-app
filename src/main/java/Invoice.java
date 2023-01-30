public class Invoice {
    //attributes
    private String invoiceNbr;
    private Stock book;
    private Shipping shipOrder;
    private double totalCost;



    //complete the constructor
    public Invoice(String invoiceNbr , Stock book, Shipping shipOrder) {
        this.invoiceNbr = invoiceNbr;
        this.book = book;
        this.shipOrder = shipOrder;
    }


    //complete the getter()
    public String getInvoiceNbr() {
        return invoiceNbr;
    }

   //Implement method
    public double invoice() {
      totalCost = book.getPrice() + shipOrder.getShipCost();
      return totalCost;
    }





}
