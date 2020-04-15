package fourthday;

import java.util.Scanner;

public class StringsThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1, str2, str3;
        str1 = "abcd";
        str2 = "dcba";

        System.out.println("str3: ");

        //str3 = "11";
        try {
            str3 = scan.next();
            int len = str3.length();
            System.out.println(len);
        } catch (Exception e){
            System.out.println("String cannot be null.");
        }
    }
}