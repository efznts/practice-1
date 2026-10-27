import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа считает кинетическую энергию тела: E = m * v * v / 2");

        System.out.print("Введите массу m (кг): ");
        double m = in.nextDouble();
        System.out.print("Введите скорость v (м/с): ");
        double v = in.nextDouble();

        if (m <= 0 || v < 0) {
            System.out.println("Ошибка: масса должна быть больше 0, скорость не меньше 0");
            return;
        }

        double e = m * v * v / 2;
        System.out.println("E = " + e + " Дж");
    }
}
