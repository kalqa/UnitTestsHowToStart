package pl.javaready.order;

import java.time.LocalDateTime;
import java.util.List;

public class OrderService {
    public Order order(List<Product> products) {
        System.out.println("Order placed ");
        return new Order(products, LocalDateTime.now());
    }
}
