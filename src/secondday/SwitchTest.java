package secondday;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Kuri siandien diena?");
        int diena = scan.nextInt();
        int j = 10;

        switch (diena) {
            case 1:
                System.out.println("Siandien pirmadienis");
                break;
            case 2:
                System.out.println("Siandien antradienis");
                break;
            case 3:
                System.out.println("Siandien treciadienis");
                break;
            case 4:
                System.out.println("Siandien ketvirtadienis");
                break;
            case 5:
                System.out.println("Siandien penktadienis");
                break;
            case 6:
                System.out.println("Siandien sestadienis");
                break;
            case 7:
                System.out.println("Siandien sekmadienis");
                break;
            default:
                if (diena >= 100) {
                    System.out.println("virs 100");
                } else {
                    System.out.println("As tokios dienos nezinau :)");
                }
        }
    }
}
