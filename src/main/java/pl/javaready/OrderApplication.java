package pl.javaready;

import pl.javaready.order.Order;
import pl.javaready.order.OrderResult;
import pl.javaready.order.OrderService;
import pl.javaready.order.Product;

import java.util.List;

class OrderApplication {
    private final OrderService orderService;

    public OrderApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderResult orderProducts(List<Product> products) {
        Order order = orderService.order(products);
        System.out.println(order.products());
        return new OrderResult(order.id(), "Success order!");
    }
}
