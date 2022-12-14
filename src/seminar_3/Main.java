// 1.Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
//2. Login должен содержать только латинские буквы, цифры и знак подчеркивания.
//3. Длина login должна быть меньше 20 символов.
//   Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//4. Password должен содержать только латинские буквы, цифры и знак подчеркивания.
//   Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
//5. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//
//6. WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами –
//   один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
//7. Обработка исключений проводится внутри метода.
//8. Метод возвращает true, если значения верны или false в другом случае.

package seminar_3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        boolean result = false;

        try {
            result = isValidInput("User_log1n", "user_Password1", "user_Password1"); // valid
            // result = isValidInput("User_log*n", "user_Password1", "user_Password1"); // Illegal characters in login input
            // result = isValidInput("User_log1n0000000000000000", "user_Password1", "user_Password1"); // Login length should be under 20 characters
            // result = isValidInput("User_log1n", "user_Password1", "user_Password2"); // Password must be equal to ConfirmPassword
            // result = isValidInput("User_log1n", "user!_Password1", "user!_Password1"); // Illegal characters in password input
            // result = isValidInput("User_log1n", "user_Password11111111111111", "user_Password1"); // Password length should be under 20 characters
        } catch (Exception e) {
            System.out.println("Invalid user input: " + e.getClass() + " --> " + e.getMessage());
        } finally {
            System.out.println(result);
        }
    }

    private static boolean isValidInput(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20) {
            throw new WrongLoginException("Login length should be under 20 characters");
        }
        if (password.length() >= 20) {
            throw new WrongPasswordException("Password length should be under 20 characters");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password must be equal to ConfirmPassword");
        }

        try {
            checkLogin(login);
        } catch (Exception exception) {
            System.out.println("Login must contain only latin letters, numbers and '_'");
            throw new WrongLoginException("Illegal characters in login input", exception);
        }

        try {
            checkPassword(password);
        } catch (Exception exception) {
            System.out.println("Password must contain only latin letters, numbers and '_'");
            throw new WrongPasswordException("Illegal characters in password input", exception);
        }

        return true;
    }

    private static void checkLogin(String login) throws IOException {
        String pattern = "[A-Za-z0-9]+(_[A-Za-z0-9]+)*";
        if (!login.matches(pattern)) {
            throw new IOException();
        }
    }

    private static void checkPassword(String password) throws IOException {
        String pattern = "[A-Za-z0-9]+(_[A-Za-z0-9]+)*";
        if (!password.matches(pattern)) {
            throw new IOException();
        }
    }

}


