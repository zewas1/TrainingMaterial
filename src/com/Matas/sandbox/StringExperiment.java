package com.Matas.sandbox;

public class StringExperiment {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String str = "Java Exercise";

        String eilute1 = new String("abc");
        String eilute2 = new String("abc");
        System.out.println(eilute1 == eilute2);
        System.out.println(eilute1.equals(eilute2));
        System.out.println(a == b);
        System.out.println(a.equals(b));

        String eilute = new String("ABC");

        System.out.println(eilute.equals(a));
        System.out.println(eilute.equalsIgnoreCase(a));

        System.out.println("Eiluciu jungimas: " + eilute1 + " " + eilute2);

        //System.out.println(a.charAt(2));

        int index1 = str.charAt(1);
        System.out.println((char) index1);

        System.out.println(str.length());

        String slaptazodis = "12345";
        if (slaptazodis.length() < 8) {
            System.out.println("Slaptazodis yra per trumpas.");
        }

        String didziosiosRaides = "MATAS";
        System.out.println(didziosiosRaides.toLowerCase());

        int amzius = 10;


    }
}
