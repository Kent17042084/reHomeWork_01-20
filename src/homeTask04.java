import java.sql.SQLOutput;
import java.util.Scanner;

public class homeTask04 {
    // Работа с классом Scanner и условными операторами if else
    //   Необходимо написать программу, где бы пользователю предлагалось ввести число 1.
    //   Если пользователь ввёл число 1, программа должна вывести сообщение: "Вы ввели число 1".
    //   Если пользователь ввёл другое число, программа должна вывести такое сообщение: "Вы ввели число не равное 1»
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        if (a == 1) {
            System.out.println("Вы ввели число 1");
        }
        else
            {
                System.out.println("Вы ввели число не равное 1");
            }

    }
}
