package loopai;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*
        do {
            System.out.println("Endless");
        } while (false);
         */
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("iveskite zodi: ");
            String input = scanner.nextLine();
            System.out.println("ivedete: " + input);
        } while (false) ;
    }

}