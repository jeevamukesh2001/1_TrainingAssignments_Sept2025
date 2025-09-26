package ecommercecart;

import java.util.Scanner;

public class ecommerceobject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Login Portal");
        System.out.println("Choose 1 for Admin");
        System.out.println("Choose 2 for Customer");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            ecommerceclass admin = new ecommerceclass();
            System.out.print("Enter Admin Username: ");
            admin.admin = sc.nextLine();
            System.out.print("Enter Admin Password: ");
            admin.adminpass = sc.nextLine();
            admin.display1();
        } else if (choice == 2) {
            System.out.print("Enter Customer Username: ");
            String username = sc.nextLine();
            System.out.print("Enter Customer Password: ");
            String password = sc.nextLine();
            System.out.println("Welcome, " + username + "!");
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }
}