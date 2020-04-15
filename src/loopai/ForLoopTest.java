package loopai;

public class ForLoopTest {
    public static void main(String[] args) {
        for (int x = 0; x < 30; x++) {
            if (x > 5) {
                break;
            }
            System.out.println(x);
        }
    }
}
