package seminar_2;

import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
// В этом задании не используем try catch.
// Пишем регулярное выражение и используем на строке метод matches.
public class HW2_Task1 {
    public static void main(String[] args) {
        System.out.println(askFloat());
    }
    private static float askFloat() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter float number: ");
        String input = iScanner.next();
        if (!input.matches("[+-]?([0-9]*[.])?[0-9]+")) {
            System.out.print("Try to input a float number again: ");
            input = iScanner.next();
        }
        iScanner.close();
        return Float.parseFloat(input);
    }
}
