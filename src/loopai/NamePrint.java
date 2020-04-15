package loopai;

import java.util.Scanner;

public class NamePrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ivesk savo varda: ");
        String firstName = scan.nextLine();
        int j = 1;
        int h = 55;


        for (int x = 1; x <= 55; x++) {
            System.out.println("My name is: " + firstName + ". ID" + x);
        }
        while (j <= 55) {
            System.out.println("My name is: " + firstName + ". ID" + j);
            j++;
        }
        do {
            System.out.println("My name is: " + firstName + ". ID" + h);
            h--;
        } while (h >= 1);
    }
}
