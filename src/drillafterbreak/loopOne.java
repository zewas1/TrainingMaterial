package drillafterbreak;

import java.util.Scanner;

public class loopOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = scan.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println("Multiplication of the number: " + number * i);
        }
    }
}
