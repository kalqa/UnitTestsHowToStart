package pl.javaready;

import pl.javaready.order.OrderResult;
import pl.javaready.order.OrderService;
import pl.javaready.order.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        OrderApplication app = new OrderApplication(orderService);
        Product product1 = new Product("laptop");
        Product product2 = new Product("telefon");
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        OrderResult orderResult = app.orderProducts(products);
        System.out.println(orderResult);
    }
}