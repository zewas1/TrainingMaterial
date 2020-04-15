package com.Matas.sandbox;

public class StringCoverter {
    public static void main(String[] args) {
        String changeMe = "Lorem ipsum dolar sit amet, consectetur adipscing elit";
        String changeMe1 = new String("Lorem ipsum dolar sit amet, consectetur adipscing elit");
        char oldChar = 'o';
        char newChar = 'z';

        System.out.println(changeMe.toLowerCase());
        System.out.println(changeMe.toUpperCase());
        System.out.println(changeMe.replace(oldChar, newChar));
        System.out.println(changeMe.endsWith("elit"));

        System.out.println(changeMe1.toLowerCase());
        System.out.println(changeMe1.toUpperCase());
        System.out.println(changeMe1.replace(oldChar, newChar));
        System.out.println(changeMe1.endsWith("elit"));
    }
}