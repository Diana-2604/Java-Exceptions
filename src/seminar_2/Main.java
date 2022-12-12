package seminar_2;// Запросить у пользователя индекс для вывода соответствующего значения целочисленного массива.
// Проверить, что введенный индекс является числом.
// Регулярные выражения для проверки:
// "\\d+" положительное целое число
// "-?\\d+" отрицательное или положительное целое число

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter index: ");
        String input = iScanner.next();
        if (!input.matches("\\d+")) { // positive integer only
            System.out.println(("Enter a number: "));
            return;
        }

        int index = Integer.parseInt(input);
        if (index >= array.length) {
            System.out.println("Index outside array");
            return;
        }

        System.out.println(array[index]);
    }
}