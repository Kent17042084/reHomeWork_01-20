public class homeTask12 {
    /* Homework 12. Работа с массивом и циклом!
    Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
    String[] a = { "Привет "," меня "," зовут "," Admin"}; */
    public static void main(String[] args) {
        // создаем массив и записываем туда строку
        String[] a = {"Привет ", " меня ", " зовут ", " Admin"};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        // формула по заменен элементов массива
        int n = a.length;
        String temp;
        for (int i = 0; i < n / 2; i++) {
            temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;
        }

        //аналогично началу, вывод массива
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}