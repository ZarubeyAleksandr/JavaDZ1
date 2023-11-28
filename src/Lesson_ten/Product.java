package Lesson_ten;

import java.util.*;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class Product {
    private final String type;
    private double price;
    private final boolean discount;
    private final LocalDate addDate;

    public Product(String type, double price, boolean discount, LocalDate addDate) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.addDate = addDate;
    }

    public boolean isDiscount() {
        return discount;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getAddDate() {
        return addDate;
    }


    public static List<Product> filterProducts(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.getPrice() > 250)
                .collect(Collectors.toList());
    }

    public void applyDiscount() {
        if (discount) this.price *= 0.9;
    }

    public static List<Product> filterBooksWithDiscount(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.isDiscount())
                .peek(Product::applyDiscount)
                .collect(Collectors.toList());

    }

    public static void findCheapestProduct(List<Product> products, String category) {
        products.stream()
                .filter(product -> product.getType().equals(category))
                .min(Comparator.comparing(Product::getPrice))
                .ifPresentOrElse(
                        product -> System.out.println("Найдешевший продукт з категорії " + category + ": Ціна - " + product.getPrice()),
                        () -> System.out.println("Продукт [категорія: " + category + "] не знайдено")
                );
    }

    public static void getLastThreeAddedProducts(List<Product> products) {
        products.stream()
                .sorted((pr1, pr2) -> pr2.getAddDate().compareTo(pr1.getAddDate()))
                .limit(3)
                .forEach(product -> System.out.println("Type: " + product.getType() + ", Price: " + product.getPrice() + ", Date Added: " + product.getAddDate()));
    }


    public static double totalCost(List<Product> products) {
        return products.stream()
                .filter(product -> product.getAddDate().getYear() == LocalDate.now().getYear())
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() <= 75)
                .mapToDouble(Product::getPrice)
                .sum();
    }


    public static Map<String, List<Product>> groupProductsByType(List<Product> products) {
        return products.stream().collect(Collectors.groupingBy(Product::getType));
    }
    
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Book", 290, true, LocalDate.of(2023, 10, 31)),
                new Product("Book", 240, false, LocalDate.of(2023, 11, 1)),
                new Product("Pen", 300, true, LocalDate.of(2023, 11, 5)),
                new Product("Book", 400, true, LocalDate.of(2023, 11, 3)),
                new Product("Book", 60, false, LocalDate.of(2022, 11, 15)),
                new Product("Book", 70, false, LocalDate.of(2023, 6, 1))
        );

        List<Product> filteredProducts = filterProducts(products);
        filteredProducts.forEach(product -> System.out.println("Тип: " + product.getType() + ", Ціна: " + product.getPrice()));

        System.out.println("Товари зі знижкою 10%");

        List<Product> discountedBooks = filterBooksWithDiscount(products);
        discountedBooks.forEach(product -> System.out.println("Тип: " + product.getType() + ", Ціна: " + product.getPrice()));


        System.out.println("Найдешевша книга");
        findCheapestProduct(products, "Book");

        System.out.println("Три останні доданих продукта");
        getLastThreeAddedProducts(products);

        System.out.println("калькуляція за умови");
        System.out.println(totalCost(products));

        Map<String, List<Product>> groupedProducts = groupProductsByType(products);

        for (Map.Entry<String, List<Product>> entry : groupedProducts.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Product product : entry.getValue()) {
                System.out.println("Тип: " + product.getType() + ", Ціна: " + product.getPrice() + ", Знижка: " + product.isDiscount() + ", Дата додавання: " + product.getAddDate());
            }
            System.out.println();
        }

    }
}
