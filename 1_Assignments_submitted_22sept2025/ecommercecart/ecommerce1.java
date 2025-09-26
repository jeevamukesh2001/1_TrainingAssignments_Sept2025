package ecommercecart;

import java.util.Scanner;

public class ecommerce1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] products = new String[100];
        String[] brands = new String[100];
        double[] prices = new double[100];
        int[] nou = new int[100];
        int count = 0;
        boolean running = true;
        while (running) {
            System.out.println("--- Admin Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    if (count < products.length) {
                        System.out.print("Enter product name: ");
                        products[count] = sc.nextLine();
                        System.out.print("Enter brand name: ");
                        brands[count] = sc.nextLine();
                        System.out.print("Enter product price: ");
                        prices[count] = sc.nextDouble();
                        System.out.print("Enter product quantity: ");
                        nou[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Product added successfully.");
                        count++;
                    } else {
                        System.out.println("Product limit reached. Cannot add more.");
                    }
                    break;
                case 2:
                    System.out.println("--- Product List ---");
                    if (count == 0) {
                        System.out.println("No products available.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.printf("%d. %s %s ₹%.2f (Qty: %d)\n", i + 1, products[i], brands[i], prices[i], nou[i]);
                        }
                    }
                    break;
                case 3:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}