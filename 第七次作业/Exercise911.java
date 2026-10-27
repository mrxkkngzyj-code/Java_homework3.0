import java.util.Scanner;

public class Exercise911 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入 a、b、c、d、e、f：");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
        if (equation.isSolvable()) {
            System.out.println("x = " + equation.getX()
                    + ", y = " + equation.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    }
}
