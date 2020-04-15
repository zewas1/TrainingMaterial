package afterbreak2;

import java.util.Scanner;

public class BankAccount {

    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerId;

    BankAccount(String customerName, String customerId, int balance) {
        System.out.println("Invoking BankAccount class constructor");
        this.customerName = customerName;
        this.customerId = customerId;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            previousTransaction = amount;
        } else {
            System.out.println("Negalima ivesti sios sumos.");
        }
    }

    public void withdraw(int amount) {
        balance = balance - amount;
        previousTransaction = -amount;
    }

    public void showPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Ivesta pinigu: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Isimta pinigu: " + previousTransaction);
        } else {
            System.out.println("Nebuvo atlikta veiksmu.");
        }
    }

    public void showMenu(){
        Scanner scan = new Scanner(System.in);
        char pasirinkimas = '\0';

        System.out.println("Sveiki, "+ customerName + ". Jusu vartotojo ID yra " + customerId);
        System.out.println();


        do {
            System.out.println("Kokia paslauga noretumete naudoti siandien?");
            System.out.println("a - Saskaitos likutis.");
            System.out.println("b - Inesti pinigu.");
            System.out.println("c - Pasiimti pinigu.");
            System.out.println("d - Paskutine atlikta operacija.");
            System.out.println("e - Iseiti.");
            System.out.println("======================");
            pasirinkimas = scan.next().charAt(0);
            System.out.println();
            System.out.println();

            switch (pasirinkimas){
                case 'a' :
                    System.out.println(balance);
                    break;
                case 'b' :
                    System.out.println("Iveskite, kiek pinigu norite inesti: ");
                    deposit(scan.nextInt());
                    break;
                case 'c' :
                    System.out.println("Iveskite, kokia suma pinigu norite isimti: ");
                    withdraw(scan.nextInt());
                    break;
                case 'd' :
                    System.out.println("Paskutine atlikta operacija: ");
                    showPreviousTransaction();
                    break;
                case 'e' :
                    System.out.println("Aciu uz tai, kad naudojates musu paslaugomis!");
                    break;
                default :
                    System.out.println("Neapdorojama funkcija, prasome pasirinkti is duotu veiksmu.");
                    break;
            }
        } while (pasirinkimas!='e');

    }
}