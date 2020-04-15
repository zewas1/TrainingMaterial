package secondday;

import java.util.Scanner;

public class Reminder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            byteTest(scan);

            shortTest(scan);

            intTest(scan);

            longTest(scan);

            floatTest(scan);

            doubleTest(scan);

            charTest(scan);

            scan.nextLine();

            stringTest(scan);
        } catch (Exception e) {
            System.out.println("Ivesties klaida, prasome ivesti duomenis nurodytus pagal klausima.");
        }

    }

    private static void stringTest(Scanner scan) {
        System.out.println("Iveskite trumpa teksta");
        String tekstoIvestis = scan.nextLine();
        System.out.println(tekstoIvestis.toUpperCase());
    }

    private static void charTest(Scanner scan) {
        System.out.println("Iveskite raide");
        char raidesIvestis = scan.next().charAt(0);
        System.out.println(raidesIvestis);
    }

    private static void doubleTest(Scanner scan) {
        System.out.println("Iveskite tris double dydzio kintamuosius dalybai ir daugybai: ");
        double n = scan.nextDouble();
        double o = scan.nextDouble();
        double p = scan.nextDouble();
        double sumDouble = (n / o) * p;
        System.out.printf("suma: %.2f", sumDouble);
        System.out.println();
    }

    private static void floatTest(Scanner scan) {
        System.out.println("Iveskite tris float dydzio kintamuosius dalybai ir daugybai: ");
        float k = scan.nextFloat();
        float l = scan.nextFloat();
        float m = scan.nextFloat();
        float sumFloat = (k / l) * m;
        System.out.println(sumFloat);
    }

    private static void longTest(Scanner scan) {
        System.out.println("Iveskite du long dydzio kintamuosius daugybai: ");
        long g = scan.nextLong();
        long h = scan.nextLong();
        long sumLong = g * h;
        System.out.println(sumLong);
    }

    private static void intTest(Scanner scan) {
        System.out.println("Iveskite du int dydzio kintamuosius dalybai: ");
        int e = scan.nextInt();
        int f = scan.nextInt();
        int sumInt = e / f;
        System.out.println(sumInt);
    }

    private static void shortTest(Scanner scan) {
        System.out.println("Iveskite du short dydzio kintamuosius atimciai: ");
        short c = scan.nextShort();
        short d = scan.nextShort();
        int sumShort = c - d;
        System.out.println(sumShort);
    }

    private static void byteTest(Scanner scan) {
        System.out.println("Iveskite du byte dydzio kintamuosius sudeciai: ");
        byte a = scan.nextByte();
        byte b = scan.nextByte();
        int sumByte = a + b;
        System.out.println(sumByte);
    }
}
