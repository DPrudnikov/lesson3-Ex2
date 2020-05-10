package task1;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Для решения уравнения ax ² + bx + c = 0 Введите a (a не равно 0) :");
        int a = scanner.nextInt();
        System.out.println("Введите b :");
        int b = scanner.nextInt();
        System.out.println("Введите c :");
        int c = scanner.nextInt();

        if (a == 0) {
            System.out.println("Ошибка!");
        }

        double Discriminant = discriminant(a, b, c);
        {
            System.out.println("Discriminant :" + Discriminant);
        }
        if (Discriminant > 0) {
            double isPositive = isPositive(a, b, c);
            {
                System.out.println(isPositive);
            }
        } else if (Discriminant == 0) {
            double isZero = isZero(a, b);
            {
                System.out.println(isZero);
            }
        } else {
            System.out.println("Уравнение не имеет корней");
        }

    }

    public static double discriminant(int a, int b, int c) {

        double Discriminant = Math.pow(b, 2) - (4 * a * c);
        {
            return Discriminant;
        }

    }

    public static double isPositive(int a, int b, int c) {

        double Discriminant = Math.pow(b, 2) - (4 * a * c);
        double d = Math.sqrt(Discriminant);
        double x1 = ((((-1 * b) + d) / 2) * a);
        double x2 = ((((-1 * b) - d) / 2) * a);
        {
            return x1 + x2;
        }


    }

    public static double isZero(int a, int b) {

        double x3 = ((-1 * b) / 2 * a);
        {
            return x3;
        }


    }
}



