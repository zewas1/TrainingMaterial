package drillafterbreak;

public class Eight {
    public static void main(String[] args) {

        int a = 5;
        int b = 13;
        int temp = a;
        a = b;
        b = temp;

        System.out.printf("Variables are now swapped! a is %d, while b is %d", a, b);
    }
}
