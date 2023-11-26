package coffee.order;

public class Main {

    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add(new Order("Alex"));
        orderBoard.add(new Order("Yura"));
        orderBoard.add(new Order("Sergey"));
        orderBoard.add(new Order("Maksim"));

        orderBoard.draw();

        System.out.println("\nDelivering next order:");
        orderBoard.deliver();
        orderBoard.draw();

        System.out.println("\nDelivering order with number #3:");
        orderBoard.deliver(3);
        orderBoard.draw();
        orderBoard.deliver(6);
    }
}
