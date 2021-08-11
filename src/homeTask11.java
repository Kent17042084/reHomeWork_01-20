import java.util.Scanner;
/*Homework 11. Работа с классом Scanner, условными операторами if и циклом for
Написать программу, которая будет выполнять следующие действия:
Ввести в консоль приветствие "Привет, меня зовут name."
Посчитать и вывести в консоль количество слов из строки введенной ранее. */

public class homeTask11{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String greeting = sc.nextLine();
        int count = 0;

        if (greeting.length() != 0) {
            count++;
            //Проверяем каждый символ, не пробел ли это
            for (int i = 0; i < greeting.length(); i++) {
                if (greeting.charAt(i) == ' ') {
                    //Если пробел - увеличиваем количество слов на 1
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}