import java.util.Scanner;

public class homeTask05 {

    /* Работа с классом Scanner и условными операторами if, if else, else .
    Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
     а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3 и в том случаи, если пользователь
     ввёл какое-либо другое число программа должна отвечать „Вы ввели число не равное 1, 2 или 3“  */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ввести число на выбор: 1, 2 или 3");
        double number = sc.nextDouble();

        if (number == 1) {
            System.out.println("you enterd number 1");
        }
        else if (number == 2){
            System.out.println("you entered number 2");
        }
        else if (number == 3){
            System.out.println("you entered number 3");
        }
        else System.out.println("Вы ввели число не равное 1, 2 или 3");
    }
}
