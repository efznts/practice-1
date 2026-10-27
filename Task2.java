import java.util.Scanner;

public class Task2 {
    public static double calculate(double x) {
        return Math.pow(Math.sin(x), 2) - Math.cos(2 * x) + Math.tan(x);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = in.nextDouble();
        System.out.println("y = " + calculate(x));
    }
}
