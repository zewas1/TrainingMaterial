/*
1. Paklausti kokio tipo degalai buvo pilti? (pvz.: Diesel, Petrol, Gas)
2. Paklausti kurioje koloneje buvo piltasi? (pvz.: 1, 2, 3...)
2. Paklausti kiek litru kuro buvo pilta? (pvz.: 12.2)
3. Paklausti litro kainos? (bonus: sukurti kintamuosius, kurie laiko atitinkamo kuro tipo kaina)
4. Apskaiciuoti bendra suma
5. Graziai atvaizduoti ceki consoleje :)
 */

package com.Matas.sandbox;

//import sun.awt.RequestFocusController;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class GasReceipt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();


        DegaluPilimas();
        try {
            CekioBuildinimas(scan, dtf, now);

        } catch (Exception e) {
            System.out.println("Turi buti ivesti tik skaiciai.");
        }

    }

    private static void CekioBuildinimas(Scanner scan, DateTimeFormatter dtf, LocalDateTime now) {
        int degalinesNr;
        double kurasLitrais;
        double litroKaina;
        double sum;
        degalinesNr = scan.nextInt();
        System.out.println("Kiek pilta kuro?");
        kurasLitrais = scan.nextDouble();
        System.out.println("Litro kaina?");
        litroKaina = scan.nextDouble();
        sum = kurasLitrais * litroKaina;
        System.out.println("*-----------------------*");
        System.out.println("|                       |");
        System.out.println("|    Mato degaline      |");
        System.out.println("|                       |");
        System.out.println("|   pirkti degalai:     |");
        if (degalinesNr == 1) {
            System.out.println("|        Diesel         |");
        } else if (degalinesNr == 2) {
            System.out.println("|        Petrol         |");
        } else {
            System.out.println("|         Gas           |");
        }
        System.out.println("|  pilta litru: " + kurasLitrais + " " + "\t|");
        System.out.println("|  litro kaina: " + litroKaina + " " + "\t|");
        System.out.printf("|  cekio suma: %.2f", sum);
        System.out.println(" " + "\t|");
        System.out.println("| " + dtf.format(now) + " " + "\t|");
        System.out.println("|_______________________|");
    }

    private static void DegaluPilimas() {
        System.out.println("Kuris degalu tipas piltas? ");
        System.out.println("1. Diesel");
        System.out.println("2. Petrol");
        System.out.println("3. Gas");
    }

}
