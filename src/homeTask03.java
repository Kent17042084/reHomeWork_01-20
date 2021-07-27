public class homeTask03 {
    /* Программа вывода в консоль текста
    Переменная Good codder равная 1
    Переменная Hillel school равная 1.5
    Инкриминировать переменную Good codder
    Переменная User равная User
    Создать переменную result, в которую записать сумму переменных Good codder и Hillel school
    Вывести в консоль следующий текст: User has (значение переменной result) years experience in IT.
    */
    public static void main(String [] args) {
        int goodCoder = 1;
        double hillelSchool = 1.5;
        goodCoder++;
        String user = "User";
        double result = goodCoder + hillelSchool;
        System.out.println(user + " has " + result + " years experience in IT.");
    }
}
