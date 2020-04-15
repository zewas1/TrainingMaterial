package secondday;

import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int guess = 0;
        String isNaujo = "";

        do {
            int theNumber = (int) (Math.random() * 100);
            int spejimai = 1;
            System.out.println("Iveskit spejima");
            while (guess != theNumber) {
                try {
                    guess = scan.nextInt(); // neatsizvelgia i raides
                } catch (Exception e) {
                    System.out.println("Galima ivesti tik sveikuosius skaicius!");
                    guess = scan.nextInt();
                }
            }
            if (guess < theNumber) {
                System.out.println("Ivestas skaicius yra per mazas. Spek dar karta.");
            } else if (guess > theNumber) {
                System.out.println("Ivestas skaicius yra per didelis. Spek dar karta");
            } else {
                System.out.println("Sveikinu! Tu laimejai, tau prireike: " + spejimai + " spejimu");
            }
            spejimai++;

            System.out.println("Zaidziam dar? (y/n)");
            isNaujo = scan.next();

        } while (isNaujo.equalsIgnoreCase("y"));
        System.out.println("Aciu uz zaidima!");
        scan.close();
    }
}