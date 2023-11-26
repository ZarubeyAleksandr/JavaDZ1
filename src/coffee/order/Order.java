package coffee.order;

public class Order {

    private static int nextOrderNumber = 1;
    private final int orderNumber;
    private final String customerName;

    public Order(String customerName) {
        this.orderNumber = nextOrderNumber++;
        this.customerName = customerName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
}
