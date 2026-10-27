import java.util.Scanner;

public class Task3 {
    public static String order(double a, double b) {
        if (a > b) {
            return a + " " + b;
        } else {
            return b + " " + a;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println(order(a, b));
    }
}
