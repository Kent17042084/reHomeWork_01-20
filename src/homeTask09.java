public class homeTask09 {
    /* Вывести в консоль с помощью циклов
     * * * * *
     * * * * *
     * * * * *
    */
    public static void main(String[] args) {
        /*  1:
       for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 5; b ++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    */
        /*  2:  */
        int a = 1, b = 1;
        while (a <= 3) {
            while (b <= 5) {
                System.out.print("* ");
            b++;
            }
            System.out.println();
            a++;
            b=1;
        }
    }
}