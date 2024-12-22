package pl.javaready;

import pl.javaready.order.OrderResult;
import pl.javaready.order.OrderService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        OrderApplication app = new OrderApplication(orderService);
        List<String> products = new ArrayList<>();
        products.add("laptop");
        products.add("telefon");
        OrderResult orderResult = app.orderProducts(products);
        System.out.println(orderResult);
    }
}