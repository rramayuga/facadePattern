package facadePattern;

public class FrontDesk {
    public void requestService(HotelService service) {
        service.performService();
    }
}