public class Dtdc implements Courier {
    public boolean orderDelivered(double amount)
    {
        System.out.println("Order Delivered through DTDC & the amount of the package is"+amount);
        return true;
    }
}
