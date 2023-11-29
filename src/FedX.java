public class FedX implements Courier{
    public boolean orderDelivered(double amount)
    {
        System.out.println("Order Delivered through FedX & the amount of the package is"+amount);
        return true;
    }
}
