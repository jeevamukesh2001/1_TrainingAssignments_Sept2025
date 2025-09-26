package ecommercecart;

import java.util.Scanner;

public class ecommerce2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] products = {"Samsung Mobile", "iPhone", "Rayban SunGlasses", "Dell Laptop", "T-Shirt"};
        double[] prices = {14999.00, 75000.00, 9999.00, 74000.00, 1299.00};
        int[] quantities = new int[5];
        boolean shopping = true;
        while (shopping) {
            System.out.println("Simulate a Shopping Cart:");
            System.out.println("1. Samsung Mobile - ₹14999.00");
            System.out.println("2. iPhone - ₹75000.00");
            System.out.println("3. Rayban SunGlasses - ₹9999.00");
            System.out.println("4. Dell Laptop - ₹74000.00");
            System.out.println("5. T-Shirt - ₹1299.00");
            System.out.println("6. Checkout");
            System.out.print("Select Product (1-5) (or) Display bill : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter quantity for Samsung Mobile: ");
                    int qty1 = sc.nextInt();
                    if (qty1 > 0) {
                        quantities[0] += qty1;
                        System.out.println(qty1 + " x Samsung Mobile added to cart.");
                    } else {
                        System.out.println("Invalid quantity. Please enter a positive number.");
                    }
                    break;
                case 2:
                    System.out.print("Enter quantity for iPhone: ");
                    int qty2 = sc.nextInt();
                    if (qty2 > 0) {
                        quantities[1] += qty2;
                        System.out.println(qty2 + " x iPhone added to cart.");
                    } else {
                        System.out.println("Invalid quantity. Please enter a positive number.");
                    }
                    break;
                case 3:
                    System.out.print("Enter quantity for Rayban SunGlasses: ");
                    int qty3 = sc.nextInt();
                    if (qty3 > 0) {
                        quantities[2] += qty3;
                        System.out.println(qty3 + " x Rayban SunGlasses added to cart.");
                    } else {
                        System.out.println("Invalid quantity. Please enter a positive number.");
                    }
                    break;
                case 4:
                    System.out.print("Enter quantity for Dell Laptop: ");
                    int qty4 = sc.nextInt();
                    if (qty4 > 0) {
                        quantities[3] += qty4;
                        System.out.println(qty4 + " x Dell Laptop added to cart.");
                    } else {
                        System.out.println("Invalid quantity. Please enter a positive number.");
                    }
                    break;
                case 5:
                    System.out.print("Enter quantity for T-Shirt: ");
                    int qty5 = sc.nextInt();
                    if (qty5 > 0) {
                        quantities[4] += qty5;
                        System.out.println(qty5 + " x T-Shirt added to cart.");
                    } else {
                        System.out.println("Invalid quantity. Please enter a positive number.");
                    }
                    break;
                case 6:
                    shopping = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid product.");
            }
        }

        // Final bill
        System.out.println("\n--- Final Bill ---");
        double grandTotal = 0.0;
        int itemNumber = 1;
        for (int i = 0; i < products.length; i++) {
            if (quantities[i] > 0) {
                double itemTotal = quantities[i] * prices[i];
                grandTotal += itemTotal;
                System.out.printf("%d. %-20s %d ₹%.2f\n", itemNumber, products[i], quantities[i], itemTotal);
                itemNumber++;
            }
        }
        System.out.printf("Total Amount: ₹%.2f\n", grandTotal);
        System.out.println("Thank you for shopping!");
    }
}
