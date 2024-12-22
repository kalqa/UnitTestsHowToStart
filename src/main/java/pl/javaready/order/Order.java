package pl.javaready.order;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record Order(
        String id,
        List<Product> products,
        LocalDateTime date,
        Delivery delivery,
        Client client
) {
    public Order(List<Product> products, LocalDateTime date, Delivery delivery, Client client) {
        this(UUID.randomUUID().toString(), products, date, delivery, client);
    }
}