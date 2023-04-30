import java.util.ArrayList;
import java.util.Scanner;

public class GroceryManagementSystem {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        while (true) {

            System.out.println("Grocery Management System");
            System.out.println("-------------------------");
            System.out.println("1. Add Product");
            System.out.println("2. Search Product");
            System.out.println("3. Display All Products");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addProduct(products);
                    break;
                case 2:
                    searchProduct(products);
                    break;
                case 3:
                    displayAllProducts(products);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

        }

    }

    private static void addProduct(ArrayList<Product> products) {

        System.out.print("Enter product name: ");
        String name = scanner.next();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(name, price, quantity);
        products.add(product);

        System.out.println("Product added successfully!");

    }

    private static void searchProduct(ArrayList<Product> products) {

        System.out.print("Enter product name: ");
        String name = scanner.next();

        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println("Product found: " + product.toString());
                return;
            }
        }

        System.out.println("Product not found!");

    }

    private static void displayAllProducts(ArrayList<Product> products) {

        System.out.println("Product List");
        System.out.println("------------");

        for (Product product : products) {
            System.out.println(product.toString());
        }

    }

}

class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " - $" + price + " - " + quantity + " in stock";
    }

}