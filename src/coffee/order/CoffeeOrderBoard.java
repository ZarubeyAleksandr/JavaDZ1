package coffee.order;

import java.util.LinkedList;
import java.util.List;

public class CoffeeOrderBoard {

    private final List<Order> orders = new LinkedList<>();

    public void add(Order order) {
        orders.add(order);
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            Order nextOrder = orders.remove(0);
            System.out.println("Delivering order #" +
                    nextOrder.getOrderNumber() +
                    " for " + nextOrder.getCustomerName());
        } else {
            System.out.println("No orders to deliver.");
        }
    }

    public void deliver(int orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber() == orderNumber) {
                Order deliveredOrder = orders.remove(i);
                System.out.println("Delivering order #" +
                        deliveredOrder.getOrderNumber() +
                        " for " + deliveredOrder.getCustomerName());
                return;
            }
        }
        System.out.println("Order #" + orderNumber + " not found.");
    }

    public void draw() {
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() +
                    " | " + order.getCustomerName());
        }
    }

}
