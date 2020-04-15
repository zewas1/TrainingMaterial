package Homework1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PlotasIrPerimetras {
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);

        System.out.println("Iveskite figuros pavadinima, kurios plota ir perimetra skaiciuosim" +
                " (Kvadratas(1), staciakampis(2), statusis trikampis(3), apskritimas(4))");
        int figura = scan.nextInt();

        if(figura == 1){
            System.out.println("Iveskite kvadarto krastines ilgi: ");
            int krastine = scan.nextInt();
            int kvadartoPlotas = krastine*krastine;
            int kvadaratoPerimetras = krastine*4;
            System.out.println("Kvadarto plotas yra: " + kvadartoPlotas + ". Kvadrato perimetras yra: "
                    + kvadaratoPerimetras);
        }
        else if(figura == 2){
            System.out.println("Iveskite staciakampio pirmosios krastines ilgi: ");
            int krastine1 = scan.nextInt();
            System.out.println("Iveskite staciakampio antrosios krastines ilgi: ");
            int krastine2 = scan.nextInt();
            int staciakampioPlotas = krastine1*krastine2;
            int staciakampioPerimetras = (krastine1*2) + (krastine2*2);
            System.out.println("Staciakampio plotas yra: " + staciakampioPlotas + ". Staciakampio perimetras yra: "
                    + staciakampioPerimetras);
        }
        else if(figura == 3){
            System.out.println("Iveskite staciojo trikampio  pirmojo statinio ilgi: ");
            int krastine1 = scan.nextInt();
            System.out.println("Iveskite staciojo trikampio  antrojo statinio ilgi: ");
            int krastine2 = scan.nextInt();
            int trikampioPlotas = (krastine1*krastine2)/2;
            double c = (krastine1*krastine1) + (krastine2*krastine2);
            c = Math.sqrt(c);
            double trikampioPerimetras = c + krastine1 + krastine2;
            System.out.println("Trikampio plotas yra: " + trikampioPlotas + ". Trikampio perimetras yra: "
                    + trikampioPerimetras);
        }
        else if(figura == 4){
            System.out.println("Iveskite apskritimo spinduli: ");
            int krastine = scan.nextInt();
            double apskritimoPlotas = Math.PI*(krastine*krastine);
            double apskritimoPerimetras = 2*Math.PI*krastine;
            System.out.println("Apskritimo plotas yra: " + apskritimoPlotas + ". Apskritimo perimetras yra: "
                    + apskritimoPerimetras);
        }
        else {
            System.out.println("As tokios figuros nezinau.");
        }

    }
}
