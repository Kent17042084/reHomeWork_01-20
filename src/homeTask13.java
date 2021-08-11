public class homeTask13 {
//Homework 13. Task 1
//Написать программу, в которой создаётся целочисленный массив из 8 случайных чисел
// из диапозона [0, 100] и выводит максимальный элемент массива в консоль.
public static void main(String[] args) {
    int array [] = new int[8];

    for (int a = 0; a < array.length; a++) {
        array[a] = (int) (Math.random() * 100);
    }

    // вывожу для просмотра состояние
    for (int a = 0; a < array.length; a++) {
        System.out.print(array[a] + " ");
    }


    int maxIndex = 0;
    for (int i = 0; i < array.length; i++) {
        if (maxIndex < array[i]) {
            maxIndex = array[i];
        }
    }
    System.out.println("maximum is " + maxIndex);
}
}