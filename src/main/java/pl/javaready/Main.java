package pl.javaready;

import pl.javaready.order.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        DeliveryService deliveryService = new DeliveryService();
        ClientService clientService = new ClientService();
        OrderApplication app = new OrderApplication(orderService, deliveryService, clientService);
        userWithTwoProducts(app);
        userWithOneProduct(app);
        userWithZeroProducts(app);
        userWithZeroProductsAndWrongEmail(app);
    }

    private static void userWithTwoProducts(OrderApplication makeOrderApplication) {
        // given
        Product product1 = new Product("laptop");
        Product product2 = new Product("telefon");
        List<Product> products = new ArrayList<>();
        Delivery delivery = new Delivery("InPost", UUID.randomUUID());
        products.add(product1);
        products.add(product2);

        // when
        OrderResult orderResult = makeOrderApplication.makeOrder(products, delivery, "bartek@op.pl", "789239123");

        // then
        if (!orderResult.id().isEmpty()) {
            System.out.println("all good!");
        } else {
            System.out.println("PROBLEM");
        }
        if (orderResult.expectedArrivalDays() == 3) {
            System.out.println("all good!");
        } else {
            System.out.println("PROBLEM");
        }
    }

    private static void userWithOneProduct(OrderApplication makeOrderApplication) {
        Product product1 = new Product("laptop");
        List<Product> products = new ArrayList<>();
        Delivery delivery = new Delivery("InPost", UUID.randomUUID());
        products.add(product1);
        makeOrderApplication.makeOrder(products, delivery, "bartek@op.pl", "789239123");
    }

    private static void userWithZeroProducts(OrderApplication makeOrderApplication) {
        List<Product> products = new ArrayList<>();
        Delivery delivery = new Delivery("InPost", UUID.randomUUID());
        makeOrderApplication.makeOrder(products, delivery, "bartek@op.pl", "789239123");
    }

    private static void userWithZeroProductsAndWrongEmail(OrderApplication makeOrderApplication) {
        List<Product> products = new ArrayList<>();
        Delivery delivery = new Delivery("InPost", UUID.randomUUID());
        makeOrderApplication.makeOrder(products, delivery, "vscvsdlvop.pl", "789239123");
    }
}