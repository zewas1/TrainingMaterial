package drillafterbreak;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class loopFive {
    public static void main(String[] args) {
        int[] arrayOfInts = {1, 7, 3, 10, 9};

        for (int i = 0; i < arrayOfInts.length/2; i++){
            int temp = arrayOfInts[i];
            arrayOfInts[i] = arrayOfInts[arrayOfInts.length - i - 1];
            arrayOfInts[arrayOfInts.length - i - 1] = temp;
        }

        System.out.println("Reversed array" + Arrays.toString(arrayOfInts));

    }
}