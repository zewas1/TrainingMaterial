package secondday;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean ciklas = true;
        String stabdom = "";

        while(!stabdom.equalsIgnoreCase("stop")){
            System.out.println("begalinis tekstas");
            System.out.println("noredami baigti iveskite stop");
            stabdom = scan.nextLine();
        }
    }
}