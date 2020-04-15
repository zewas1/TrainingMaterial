package com.Matas.sandbox;

public class test {
    public static void main(String[] args) {
        StringBuilder x = new StringBuilder ("Tom");
        x.append ("&");
        System.out.println(x);
        StringBuilder y = x.append("Jerry");
        System.out.println(y);
    }
}