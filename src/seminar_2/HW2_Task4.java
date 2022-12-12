package seminar_2;// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя. (try быть не должно)

import java.util.Scanner;

public class HW2_Task4 {
    public static void main(String[] args) {
        checkUserInput();
    }

    private static void checkUserInput() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String input = iScanner.nextLine();
        iScanner.close();

        if (input.isEmpty()) {
            throw new RuntimeException("Cannot enter an empty string");
        }

        System.out.println("Your input: " + input);
    }
}
