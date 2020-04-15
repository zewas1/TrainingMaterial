package fourthday;

import java.util.Scanner;

public class SuperCar {

    Scanner scan = new Scanner(System.in);

    String spalva;
    int ratai;
    int bakas;
    int degalai;
    int pervirsis;
    public static int GREITIS = 100;
    SuperCar() {
        spalva = "Melyna";
        ratai = 4;
        bakas = 100;
        degalai = 0;
    }

    SuperCar(String spalva, int ratai, int bakas) {
        this.spalva = spalva;
        this.ratai = ratai;
        this.bakas = bakas;
    }


    public void nuvazioavoTyliai() {
        if (ratai < 1){
            System.out.println("Masina negali vaziuoti, nes neturi pakankamai ratu.");
        }
        else {
            System.out.println("masina nuvaiavo" + bakas + "kilometru");
        }

    }
    public String nuvaziavo() {
        return "masina nuvaiavo" + bakas + "kilometru";
    }
    public void pripiltiBaka(int ipilamiDegalai) {
        if(bakas > ipilamiDegalai) {
            degalai += ipilamiDegalai;
        }/*
        else if(degalai == bakas){

        }*/
        else {
            pervirsis = ipilamiDegalai - bakas;
            degalai = bakas;

            System.out.println("pervirsis: " + pervirsis);
        }
    }
}