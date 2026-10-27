import java.util.Random;

public class Exercise94 {
    public static void main(String[] args) {
        Random random = new Random(1000);

        for (int i = 1; i <= 50; i++) {
            System.out.printf("%4d", random.nextInt(100));
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
