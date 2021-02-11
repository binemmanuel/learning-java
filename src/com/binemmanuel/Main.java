package com.binemmanuel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Request for username
        String username = requestUsername();
        String email = requestEmail();
        String phoneNmber = requestPhoneNumber();
        String password = requestPassword();

        User user = new User(username, email, phoneNmber, password);

        System.out.println(user.email);
    }

    private static String requestUsername() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        return username;
    }

    private static String requestEmail() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        return email;
    }

    private static String requestPhoneNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        return phoneNumber;
    }

    private static String requestPassword() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        return password;
    }
}
