package drillafterbreak;

import java.util.Scanner;

public class Sixth  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First number: ");
        int numberOne = scan.nextInt();
        System.out.println("Second number: ");
        int numberTwo = scan.nextInt();
        System.out.println("Third number: ");
        int numberThree = scan.nextInt();

        System.out.println();

        System.out.printf("First number: %d, Second Number: %d, Third number: %d, Average: %d" , numberOne,
                numberTwo,numberThree,(numberOne+numberTwo+numberThree)/3);
    }
}
