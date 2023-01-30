public class Order {
    //attributes
    private Customer customer;
    private Stock book;

    public Order(Customer customer, Stock book) {
        //complete the constructor
        this.customer = customer;
        this.book = book;
    }

    //complete the getters()
    public Customer getCustomer() {
        return customer;
    }

    public Stock getStock() {
        return book;
    }
}
