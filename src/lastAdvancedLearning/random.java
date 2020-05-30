package lastAdvancedLearning;

import java.util.Random;
import java.util.function.Supplier;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        int skaicius = random.nextInt();

        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt();
        System.out.println(randomNumberSupplier.get());
    }
}
