package ecommercecart;

import java.util.Scanner;

public class ecommerceclass {
    String admin, adminpass, user, userpass;
    public static String validatePassword(String password) {
        StringBuilder errors = new StringBuilder();
        if (password.length() < 8 || password.length() > 12) {
            errors.append("- Password must be 8 to 12 characters long\n");
        }
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else if ("!@#$%^&*()-+=".indexOf(ch) >= 0) hasSpecial = true;
        }
        if (!hasUpper) errors.append("- Must contain at least one uppercase letter\n");
        if (!hasLower) errors.append("- Must contain at least one lowercase letter\n");
        if (!hasDigit) errors.append("- Must contain at least one digit\n");
        if (!hasSpecial) errors.append("- Must contain at least one special character (!@#$%^&*()-+=)\n");
        return errors.toString();
    }

    public void display1() {
        String result = validatePassword(adminpass);
        if (result.isEmpty()) {
            System.out.println("Admin: " + admin + " | Password: " + adminpass);
        } else {
            System.out.println("Admin password errors:\n" + result);
        }
    }

    public void display2() {
        String result = validatePassword(userpass);
        if (result.isEmpty()) {
            System.out.println("User: " + user + " | Password: " + userpass);
        } else {
            System.out.println("User password errors:\n" + result);
        }
    }
}