package fifthday;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayExcercise {
    public static void main(String[] args) {

        //data
        String isNaujo = "";

        int[] myArray = {1, 7, 3, 10, 9};
        List<Integer> oddArray = new ArrayList<Integer>();
        int count = 0;
        int sum = 0;


        // first assignment
        /*
        for (int i = 0; i < myArray.length;i++){
            sum = sum + myArray[i];
            count ++;
        }
        double average = sum / count;
        System.out.println("The average of this array is: " + average);


        Scanner scan = new Scanner(System.in);

        //testing tool

        do{
            System.out.println("Ivesti skaiciu: ");
            int number = scan.nextInt();
            System.out.println(number%2);

            System.out.println("Vesti nauja skaiciu? (y/n)");
            isNaujo = scan.next();
        } while (isNaujo.equalsIgnoreCase("y"));
        */

      //  System.out.println("Odd array values: " + oddArray);


        // second assignment
        for (int i = 0; i < myArray.length;i++){
            int index = 0;
            if (myArray[i]%2 > 0) {
                oddArray.add(myArray[i]);
            }
        }
        System.out.println("New array of odd numbers: " + oddArray);

    }
}
