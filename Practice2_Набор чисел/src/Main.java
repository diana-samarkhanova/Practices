//Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
//Избавиться от повторяющихся элементов в строке и вывести результат на экран.
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите набор чисел: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] numbers = input.split(",\\s*");

        Set<String> uniqueNum = new HashSet<>();

        for (String number : numbers) {
            uniqueNum.add(number);
        }

        StringBuilder result = new StringBuilder();
        for (String number : uniqueNum) {
            result.append(number).append(", ");
        }

        if (result.length() > 2) {
            result.setLength(result.length() - 2);
        }
        System.out.println("Результат: " + result.toString());

    }
}