public class Flipkart {
    //Here flipkart is the target class.
    private Courier courier;
    //Constructor Injection
//    public Flipkart(Courier courier)
//    {
//        this.courier=courier;
//    }
    //Setter Injection
    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public boolean shipOrder(double amount)
    {
        return courier.orderDelivered(amount);
    }
}
