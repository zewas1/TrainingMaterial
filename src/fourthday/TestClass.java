package fourthday;

class TestClass {
    TestClass() {
    }
    public static void main(String[] args) {
        SuperCar superCar = new SuperCar();
        SuperCar moreSuper = new SuperCar();
        String rezultatas = superCar.nuvaziavo();
        System.out.println(rezultatas);
        superCar.nuvazioavoTyliai();
        System.out.println("=========");
        superCar.GREITIS = 50;
        int statinis = superCar.GREITIS;
        int statinis1 = moreSuper.GREITIS;
        System.out.println(statinis);
        System.out.println(statinis1);
        superCar.pripiltiBaka(300);
        System.out.println("degalu kiekis: "+superCar.degalai);

        SuperCar naujaMasina = new SuperCar ("Raudona", 0, 177);
        /*
        if (naujaMasina.ratai < 1){
            System.out.println("Masina neglai vaziuoti");
        } else {
            naujaMasina.nuvaziavo();
        }
         */

        naujaMasina.nuvazioavoTyliai();
    }
}