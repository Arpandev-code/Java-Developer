public class FirstFlight implements Courier {
    @Override
   public boolean orderDelivered(double amount)
    {
        System.out.println("Order Delivered through FirstFlight & the amount of the package is"+amount);
        return true;
    }
}
