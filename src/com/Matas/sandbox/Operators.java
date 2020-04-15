package com.Matas.sandbox;

public class Operators {
    public static void main(String[] args) {
        int x = 4;

        System.out.println(x++);
        System.out.println(--x);
        System.out.println(x % 3);
        System.out.println(22 % 2);
        System.out.println(7 % x++);
        System.out.println(x == 4);
        System.out.println(x != 4);
        x = 10;
        int y = 5;
        System.out.println(x == 10 && y <= 5);
        System.out.println(x <= y && y > 3);
        System.out.println("1" instanceof String);

        int a = 5;
        a += 2;
        System.out.println(a);

        int b = 2;
        int c = 5;
        b *= c;
        System.out.println(b);
    }
}
