package drillafterbreak;

import java.util.Scanner;

public class LoopThree {
    public static void main(String[] args) {
        int[] arrayOfInts = {1, 7, 3, 10, 9};
        int sum = 0;

        for (int i = 0; i < arrayOfInts.length; i++){
            sum = arrayOfInts[i]+sum;
            int max = arrayOfInts[i];
            int min = arrayOfInts[i];

            if (arrayOfInts[i]%2!=0){
                System.out.println("Odd numbers: " + arrayOfInts[i]);
            }
        }

        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + sum / arrayOfInts.length);
        //System.out.println("Max is: " + max);
        //System.out.println("Min is: " + min);
    }
}