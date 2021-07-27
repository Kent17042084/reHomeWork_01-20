import java.util.Scanner;

public class homeTask06 {
    // Работа с классом Scanner и условными операторами if, if else, else с использованием логического оператора!
    // Необходимо написать программу, где бы пользователю предлагалось ввести два числа на выбор: 1, 2 или 3,
    // если пользователь ввел 1 и 2, программа должна сказать "Пользователь ввел 1 и 2", если пользователь ввел 2 и 3,
    // программа должна сказать "Пользователь ввел 2 и 3", если пользователь ввёл какую-либо другую комбинацию цифр,
    // программа должна сказать, какие числа ввёл пользователь.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number one");
        double a = sc.nextDouble();
        System.out.println("enter number two");
        double b = sc.nextDouble();

        if ((a == 1) && (b == 2)) {
            System.out.println("Пользователь ввел 1 и 2");
        }
            else if ((a == 2) && (b == 3)) {
            System.out.println("Пользователь ввел 2 и 3");
        }
            else System.out.println("you enterd " + a + " " + b);
    }
}
