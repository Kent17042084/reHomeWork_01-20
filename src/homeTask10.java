import java.util.Scanner;

public class homeTask10 {
    // Работа с использованием условного оператора и оператора return!
    // Необходимо написать метод, который бы возвращал из 2 чисел
    // меньшее число. Например, из двух чисел 7 и 3 метод
    // должен вывест в консоль 3.

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        double a = sc.nextDouble();
        System.out.println("enter number 2");
        double b = sc.nextDouble();

        System.out.println("minim of your numbers is " + min(a, b));
    }

    public static double min (double a, double b) {
        if (a < b) {
            return a;
        } else
            return b;
    }
}