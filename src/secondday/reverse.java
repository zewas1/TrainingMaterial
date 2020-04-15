package secondday;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("iveskite zodi: ");

            String input = scan.nextLine();

            StringBuilder builder = new StringBuilder();
            builder.append(input);
            System.out.println("Ivestas zodis atbulai: " + builder.reverse());

    }
}