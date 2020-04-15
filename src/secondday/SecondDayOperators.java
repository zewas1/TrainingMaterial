package secondday;

public class SecondDayOperators {
    public static void main(String[] args) {
        int x = 10;
        double y = 2.5;
        String b = "lorem ipsum";
        String c = "asdasdasd";

        Double rand = Math.random()* 100;
        //int theNumber = int(rand);

        System.out.println(11 % x);
        System.out.println(x--);
        System.out.println(x >= 10);
        System.out.println(rand > 5 || x >= 11);
        System.out.println(rand > 5 && x < 17);
        System.out.println(++rand);
        System.out.println(x*=3);
        System.out.println(x == 17);
        System.out.println(rand != "abc".length());

    }
}
