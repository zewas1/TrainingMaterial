package com.Matas.sandbox;

import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int veiksmas;
        int pirmasSkaicius;
        int antrasSkaicius;
        int treciasSkaicius;
        int rezultatas;

        System.out.println("1 sudetis");
        System.out.println("2 atimtis");
        System.out.println("3 dalyba");
        System.out.println("4 daugyba");

        System.out.print("Koki veiksma atlikti?");
        try {
            veiksmas = scan.nextInt();
            System.out.print("Iveskite pirmaji skaiciu: ");
            pirmasSkaicius = scan.nextInt();
            System.out.print("Iveskite antraji skaiciu: ");
            antrasSkaicius = scan.nextInt();
            System.out.print("Iveskite treciaji skaiciu: ");
            treciasSkaicius = scan.nextInt();
            if (veiksmas == 1) {
                rezultatas = pirmasSkaicius + antrasSkaicius + treciasSkaicius;
                System.out.println("Rezultatas: " + rezultatas);
            } else if (veiksmas == 2) {
                rezultatas = pirmasSkaicius - antrasSkaicius - treciasSkaicius;
                System.out.println("Rezultatas: " + rezultatas);
            } else if (veiksmas == 3) {
                rezultatas = (pirmasSkaicius / antrasSkaicius) / treciasSkaicius;
                System.out.println("Rezultatas: " + rezultatas);
            } else if (veiksmas == 4) {
                rezultatas = pirmasSkaicius * antrasSkaicius * treciasSkaicius;
                System.out.println("Rezultatas: " + rezultatas);
            } else {
                System.out.println("As dar nesuprogramuotas daryti tokio veiksmo.");
            }

        } catch (Exception a) {
            System.out.println("Galima ivesti tik sveikuosius skaicius");
        }

    }
}
