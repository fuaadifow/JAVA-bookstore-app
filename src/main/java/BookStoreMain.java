import java.time.LocalDate;

public class BookStoreMain {
    public static void main(String[] args) {
        //create a bookStore object and instantiate
         Customer customer1;
         Stock stock1;
         Order order1;
         Shipping shipOrder1;
         Invoice invoice1;
         BookStore bookStore1;
         Customer customer2;
         Stock stock2;
         Order order2;
         Shipping shipOrder2;
         Invoice invoice2;
         BookStore bookStore2;

        //create a customer who can then buy books (used name,phone and email from junit test)
        customer1 = new Customer("Jane Words", "+4472394586971", "wordsj@gmail.com");

        //customer1 places an order to purchase a book (bookname,author and price from junit test)
        stock1 = new Stock("Death in the afternoon","Hemingway E.", 15.45);

        //placing the order ****
        order1 = new Order(customer1, stock1);

        //determine the shipping date (date,month and year acquired from junit test)
        LocalDate shipDate1 = LocalDate.of(2022, 12, 25);
        shipOrder1 = new Shipping(order1, shipDate1);

        //calculate the shipping cost to send the order
        shipOrder1.calcShipCost(true);
        shipOrder1.getShipCost();


        //create an invoice **** (invoice Nbr obtained from junit test)
        invoice1 = new Invoice("DIT001",stock1,shipOrder1);

        // Call Invoice
        invoice1.invoice();


        //add the invoices to a list so that we can search for an invoice ****
        bookStore1 = new BookStore();
        bookStore1.getInvoices().add(invoice1);

        //Calling pilingUpOfOrders method
        bookStore1.pilingUpOfOrders();

        //a repeat with another customer, order, etc... (name,phone and email obtained from junit test)
        customer2 = new Customer("Safwa Woods", "+447981234582", "woodss@gmail.com");

        //customer2 places an order to purchase a book (Bookname, author and price obtained from junit test)
        stock2 = new Stock("Lord of the rings","Tolkien J.R.R.", 12.95);

        //Place the order
        order2 = new Order(customer2, stock2);


        //determine the shipping date (date,month and year obtained from junit test)
        LocalDate shipDate2 = LocalDate.of(2022, 12, 25);
        shipOrder2 = new Shipping(order2,shipDate2);

        //calculate the shipping cost to send the order
        shipOrder2.calcShipCost(true);
        shipOrder2.getShipCost();

        //create an invoice (invoiceNbr obtained from junit test)
        invoice2 = new Invoice("LOT111",stock2,shipOrder2);

        //call invoice method
        invoice2.invoice();

        //add the invoices to a list so that we can search for an invoice
        bookStore2 = new BookStore();
        bookStore2.getInvoices().add(invoice2);

        //piling order
        bookStore2.pilingUpOfOrders();

        //search for order
        bookStore1.searchOrder(invoice1.getInvoiceNbr());
        bookStore2.searchOrder(invoice2.getInvoiceNbr());
    }
}

