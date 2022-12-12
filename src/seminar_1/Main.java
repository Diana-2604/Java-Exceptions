package seminar_1;// Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
// Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
// 1. если длина массива меньше некоторого заданного минимума, метод возвращает -1 в качестве кода ошибки
// 2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
// 3. если вместо массива пришел null, метод вернет -3
// Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит искомое
// число у пользователя, обработает возвращенное значение и покажет читаемый результат пользователю.
// Например, если вернутся -2, вывести пользователю: "Искомый элемент не найден"

import java.util.Scanner;
public class Main {
    private final static int MIN_LENGTH = 5;

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6}; /* option + command + L to reformat */
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter search value: "); /* sout to call System.out.println*/
        int value = iScanner.nextInt();
        iScanner.close();

        int result = findIndexOf(value, array);
        if (result == -1) {
            System.out.println("Заданный массив меньше минимального значения");
        } else if (result == -2) {
            System.out.println("Искомый элемент не найден");
        } else if (result == -3) {
            System.out.println("Заданный массив не содержит значений для поиска");
        } else {
            System.out.println("Индекс искомого элемента: " + result);
        }
    }

    private static int findIndexOf(int value, int[] array) {
        if (array == null) return -3;

        if (array.length < MIN_LENGTH) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -2; /* value not found */
    }
}