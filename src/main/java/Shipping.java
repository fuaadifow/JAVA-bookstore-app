//import to be included
import java.time.LocalDate;
public class Shipping {
  private Order order;
  private LocalDate shipDate;
  private double shipCost;
  public static int countUrgent;

    //Implement constructor
    public Shipping(Order order, LocalDate shipDate) {
        this.order = order;
        this.shipDate = shipDate;
    }
     //Implement Getter
    public LocalDate getShipDate() {
       return shipDate;
}
    public double getShipCost() {
        return shipCost;
    }

    //Implement Setter
    public void setShipCost (double shipCost) {
      this.shipCost = shipCost;
    }

    //Implement Method
    public double calcShipCost(boolean isUrgent) {


        if(isUrgent == true) {
            shipCost = 5.45;
            countUrgent ++;
        }
            else {
                shipCost =3.95;
            }

        return shipCost;
    }


}