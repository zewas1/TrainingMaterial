package fifthday;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class CrystalBall {
        ArrayList<String> divinations = new ArrayList<>();

        CrystalBall(){
            divinations.add("Siandien bus gera diena.");
            divinations.add("Siandien bus geriau negu gerai.");
            divinations.add("Bus gerai ne tik siandien, bet ir ryt.");
        }

        public String divine () {
            Random random = new Random();
            int randomNumber = random.nextInt(3);
            return divinations.get(randomNumber);
        }

    public static void main(String[] args) {
        CrystalBall crystalBall = new CrystalBall();
        System.out.println(crystalBall.divine());
    }
}
