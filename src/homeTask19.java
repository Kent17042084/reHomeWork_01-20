public class homeTask19 {
//  Работа с регулярными выражениями.
// Написать программу с использованием регулярного выражения!
// Текст и символ регулярного выражения произвольный,
    public static void main(String[] args) {
        String helloWord = "очень длинная строка с кучей разных букв н";
        String[] words = helloWord.trim().split(" ");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
