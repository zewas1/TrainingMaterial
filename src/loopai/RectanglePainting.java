package loopai;

public class RectanglePainting {
    public static void main(String[] args) {
        int x = 8;

        for (int i = 0; i < x; i++) {
            System.out.println("**********");
        }
        System.out.println();
        for (int i = 0; i < x; i++) {
            if (i == 0 || i == 7) {
                System.out.println("++++++++++");
            } else {
                System.out.println("+        +");
            }
        }
    }
}