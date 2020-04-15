package drillafterbreak;

import java.util.Scanner;

public class LoopTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Input number: ");
        //int number = scan.nextInt();

        for (int i = 0; i <= 100; i++){
            if (i%2!=1)
            System.out.println("Even numbers: " +  i);
        }
    }
}

