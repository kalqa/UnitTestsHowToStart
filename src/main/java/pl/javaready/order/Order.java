package pl.javaready.order;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record Order(
        String id,
        List<Product> products,
        LocalDateTime date
) {
    public Order(List<Product> products, LocalDateTime date) {
        this(UUID.randomUUID().toString(), products, date);
    }
}