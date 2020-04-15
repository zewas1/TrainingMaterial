package Hangman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HangmanGame {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        List<String> zodziuSarasas = new ArrayList<>(
                Arrays.asList("buratinas", "dangus", "prezidentas", "ananasas", "pasikliaudamas", "lopinys"));
        // zodziuSarasas.add("zodis");

        int bandymuSkaicius = 5;
        int randomSkaicius = ThreadLocalRandom.current().nextInt(0, 4);
        String randomZodis = zodziuSarasas.get(randomSkaicius);
        int randomZodzioIlgis = randomZodis.length();

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < randomZodzioIlgis; i++) {
            stringBuffer.append("*");
        }

        String pasleptasZodis = stringBuffer.toString();

        char[] pasleptoZodzioSimboliuMasyvas = pasleptasZodis.toCharArray();
        char[] randomZodzioSimboliuMasyvas = randomZodis.toCharArray();

        System.out.println("Sveiki atvyke i zaidima Kartuves!");
        System.out.println("\n\n");
        System.out.println("Atspekite zodi. Jus turesite 5 sansus suklysti. Speliokite po viena raide (mazaja)!");

        do {
            System.out.println("Spekite raide: ");
            System.out.println("Zodis kolkas atrodo taip: " + Arrays.toString(pasleptoZodzioSimboliuMasyvas));
            char raide = scan.next().charAt(0);

            if (randomZodis.indexOf(raide) != -1) {
                System.out.println("===================================");
                System.out.println("Atspejote raide! Teisinga raide [" + raide + "]. Spekite toliau.");
                for (int i = 0; i < randomZodzioSimboliuMasyvas.length; i++) {
                    if (randomZodzioSimboliuMasyvas[i] == raide) {
                        pasleptoZodzioSimboliuMasyvas[i] = raide;
                    }
                }
            }
            else if (randomZodzioSimboliuMasyvas == pasleptoZodzioSimboliuMasyvas){
                System.out.println("Sveikinu, laimejai!");
            }


        } while (bandymuSkaicius > 0);

    }
}