package simpleEmailGenerator;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String companySuffix = "imone.lt";
    //Susikuriame konstruktoriu
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //nustatyti departamenta
        this.department = setDepartment();
        //sugeneruoti slaptazodi
        //isspausdinti email
        //jonas.nainys@finansai.imone.lt
        String email = firstName.toLowerCase() + "."
                + lastName.toLowerCase() + "@"
                + department + "."
                + companySuffix;
        System.out.println("Sugeneruotas el. pasto adresas: " + email);
    }
    //surenkame info apie departamenta
    private String setDepartment() {
        System.out.println("************************");
        System.out.println("Pasirinkite departamenta");
        System.out.println("1. Pardavimu.");
        System.out.println("2. Finansu");
        System.out.println("3. Skolu");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        if(departmentChoice == 1) {
            return "pardavimai";
        } else if(departmentChoice == 2) {
            return "finansai";
        } else if(departmentChoice == 3) {
            return "skolos";
        } else {
            return "";
        }
    }
}