import java.util.Scanner;

public class Exercise910 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入 a、b、c：");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double d = equation.getDiscriminant();

        if (a == 0) {
            System.out.println("a 不能为 0，输入的不是二次方程。");
        } else if (d > 0) {
            System.out.println("两个根为：" + equation.getRoot1()
                    + " 和 " + equation.getRoot2());
        } else if (d == 0) {
            System.out.println("一个根为：" + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }
    }
}
