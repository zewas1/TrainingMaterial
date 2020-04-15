package com.Matas.sandbox;

import java.util.ArrayList;
import java.util.List;

public class JavaTypes {
    public static void main(String[] args){
        byte bitas = 3;
        System.out.println("Bitas: "+ bitas);

        short shortNumber = 5;
        System.out.println("trumpas skaicius: " + shortNumber);

        int number = 5;
        System.out.println("Sveikas skaicius: " + number);

        long longNumber = 1231231231123123L;
        System.out.println("Ilgas skaicius: " + longNumber);

        float floatNumber = 5.5f;
        System.out.println("Float: " + floatNumber);

        double doubleNumber = 2.3;
        System.out.println("Dvejetainis skaicius: " + doubleNumber);
        double value =200.3456;
        System.out.printf("Value: %.2f", value);
        System.out.println();

        char character = 'a';
        System.out.println("Simbolis: " + character);

        boolean isSunday = true;
        System.out.println("Loginis kintamasis: " + isSunday);

        String text = "Today is Saturday";
        System.out.println("Tekstinis objektas: " + text);

        int[] intArrayWithSize = new int[2];
        intArrayWithSize[0] = 1;
        intArrayWithSize[1] = 2;
        System.out.println("Skaiciu masyvas su nustatytu dydziu: " + intArrayWithSize.length);

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        System.out.println("Skaiciu sarasas su nezinomais dydziais: " + ints.get(1));

    }
}