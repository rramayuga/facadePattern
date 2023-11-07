package facadePattern;

public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void performService() {
        requestCart(numberOfCarts);
    }

    private void requestCart(int numberOfCarts) {
        System.out.println("Cart service is providing " + numberOfCarts + " cart(s) for luggage.");
    }
}
