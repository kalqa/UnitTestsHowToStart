package pl.javaready.order;

import java.time.LocalDateTime;
import java.util.List;

public class OrderService {
    public Order order(Client client, List<Product> products, Delivery delivery) {
        System.out.println("Order placed for client: " + client.email());
        return new Order(products, LocalDateTime.now(), delivery, client);
    }
}
