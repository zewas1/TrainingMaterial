package advancedJavaLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample2 {
    public static void main(String[] args) {
        //List<String> listOfStrings = new ArrayList<>();
        List<Preke> prekes = new ArrayList<>();
        Preke pirmojiPreke = new Preke(1, "Monitorius", 5, 100);
        Preke antrojiPreke = new Preke(2, "Printeris", 3, 50);
        for (int i = 0; i < 5; i++) {
            //skaitymo funkcija
            Preke prekeIsFailo = new Preke(1, "Monitorius", 5, 100);
            prekes.add(prekeIsFailo);
        }
        Scanner scanner = new Scanner(System.in);
        //prideti prekes funkcija
        Preke treciojiPreke = new Preke();
        System.out.println("Iveskite prekes ID");
        treciojiPreke.setId(scanner.nextInt());
        System.out.println("Iveskite prekes pavadinima");
        treciojiPreke.setPavadinimas(scanner.next());
        System.out.println("Iveskite prekes kiekis");
        treciojiPreke.setKiekis(scanner.nextInt());
        System.out.println("Iveskite prekes kaina");
        treciojiPreke.setKaina(scanner.nextInt());
        prekes.add(pirmojiPreke);
        prekes.add(antrojiPreke);
        prekes.add(treciojiPreke);
        //gauti prekiu sarasa
        for (Preke preke : prekes) {
            System.out.println(preke.toString());
        }
        //pirkti preke
        //zmogus pasirinko ir nusipirko preke su ID 2
        prekes.remove(2);
        System.out.println("po pirkimo liko prekiu");
        //gauti prekiu sarasa
        for (Preke preke : prekes) {
            System.out.println(preke.toString());
        }
    }
}
