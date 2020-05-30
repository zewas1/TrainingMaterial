package hw;


import java.util.Scanner;

class phoneCharacteristics {
    String model;
    int ram;
    int cpu;

    public void turnOn() {
        System.out.println("Phone is now on!");
    }

    public void doNotDisturb() {
        System.out.println("Do not disturb mode is now on!");
    }

    public void peopleSurveillance() {
        System.out.println("Your every step is tracked :)");
    }
}

class phone extends phoneCharacteristics {

    public static void main(String[] args) {
        phone newPhone = getPhone();
        checkPhone(newPhone);
    }

    private static phone getPhone() {
        Scanner scan = new Scanner(System.in);

        phone newPhone = new phone();

        System.out.println("Iveskite modelio pavadinima (Huawei, Apple, Samsung)");
        newPhone.model = scan.next();
        return newPhone;
    }

    private static void checkPhone(phone newPhone) {
        if (newPhone.model.equalsIgnoreCase("Huawei")) {
            newPhone.turnOn();
            System.out.println(" ");
            newPhone.peopleSurveillance();
            specs(newPhone);
            System.out.println("");

        } else if (newPhone.model.equalsIgnoreCase("Apple")) {
            newPhone.turnOn();
            System.out.println(" ");
            newPhone.doNotDisturb();
        } else if (newPhone.model.equalsIgnoreCase("Samsung")) {
            newPhone.turnOn();
        } else {
            System.out.println("I'm not sure what phone it is :(");
        }
    }

    private static void specs(phone newPhone) {
        newPhone.cpu = 2;
        newPhone.ram = 8;
    }
}
