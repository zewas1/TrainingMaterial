package PrisijungimoSistema;

//loop for password retry.

import java.util.Scanner;

public class PagrindinisFailas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        LoginDetails input = new LoginDetails();

        System.out.println("Enter your email: ");
        input.email = scan.next();
        //String str = input.email;
        //char[] cArray = str.toCharArray();

        if (EmailPatterCheck.isValid(input.email)) {
            System.out.println("Email is valid!");
        } else {
            System.out.println("Email is invalid");
            input.email = "Invalid";
        }

        System.out.println("Enter your password: ");
        input.password = scan.next();

        if (PasswordCheck.isValid(input.password)) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Password is invalid");
            input.password = "Invalid";
        }

        //input.ShowDetails();
        if (input.email.equals("Invalid") || input.password.equals("Invalid")) {
            System.out.println("Please create a new account.");
        } else {
            System.out.println("=============");
            System.out.println("Enter email to login");
            input.emailConnection = scan.next();
            System.out.println("Enter password to login");
            input.passwordConnection = scan.next();
            input.Connection();
        }
    }
}