package pl.javaready;

import pl.javaready.order.*;

import java.util.List;

class OrderApplication {
    private final OrderService orderService;
    private final DeliveryService deliveryService;
    private final ClientService clientService;

    public OrderApplication(OrderService orderService, DeliveryService deliveryService, ClientService clientService) {
        this.orderService = orderService;
        this.deliveryService = deliveryService;
        this.clientService = clientService;
    }

    public OrderResult makeOrder(List<Product> products, Delivery delivery, String email, String phoneNumber) {
        Client client = clientService.register(email, phoneNumber);
        Order order = orderService.order(client, products, delivery);
        DeliveryResponse result = deliveryService.sendInfo(order);
        System.out.println(result.expectedArrivalDays());
        return new OrderResult(order.id(), result.expectedArrivalDays());
    }
}
