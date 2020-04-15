package fifthday;

import java.util.Scanner;

public class SwitchTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Iveskite pazymi: ");
        int grade = scan.nextInt();

        switch(grade){
            case 10:
                System.out.println("Perfect");
                break;
            case 9:
                System.out.println("Very good");
                break;
            case 5:
                System.out.println("You passed");
            case 4:
                System.out.println("You failed");
                break;
            default:
                System.out.println("I don't know this evaluation.");
        }

    }
}
