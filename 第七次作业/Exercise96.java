import java.util.Random;

public class Exercise96 {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        selectionSort(numbers);
        stopwatch.stop();

        System.out.println("选择排序 100000 个数字的执行时间："
                + stopwatch.getElapsedTime() + " 毫秒");
        System.out.println("排序是否正确：" + isSorted(numbers));
    }

    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
    }

    private static boolean isSorted(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] > numbers[i]) return false;
        }
        return true;
    }
}
