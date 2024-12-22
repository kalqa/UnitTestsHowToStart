package pl.javaready.order;

public class DeliveryService {

    public DeliveryResponse sendInfo(Order order) {
        // sending order to delivery service
        return new DeliveryResponse(3);
    }
}
