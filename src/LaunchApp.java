public class LaunchApp {
    public static void main(String[] args) {
        Flipkart fl=new Flipkart();
        fl.setCourier(new FedX());// FedX class Object used in FlipKart Target class
       boolean status= fl.shipOrder(50.0);
       if(status)
       {
           System.out.println("Order Delivered");
       }else
       {
           System.out.println("Failed to deliver product");
       }
    }
}
