package drillafterbreak;

import java.util.Scanner;

public class LoopFour {
    public static void main(String[] args) {
        int[] arrayOfInts = {1, 7, 3, 10, 9};
        int sum = 0;
        int min = arrayOfInts[1];
        int max = arrayOfInts[1];

        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] > max) {
                max = arrayOfInts[i];
            } else if (arrayOfInts[i] < min) {
                min = arrayOfInts[i];
            }
        }

        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
    }
}