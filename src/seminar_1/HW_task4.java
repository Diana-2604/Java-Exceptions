package seminar_1;// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен
// частному элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение,
// которое пользователь может увидеть - RuntimeException, т.е. ваше

import java.util.Arrays;

public class HW_task4 {
    public static void main(String[] args) {
        int[][] array1 = {{10, 8}, {3, 9}};
        int[][] array2 = {{3, 2}, {2, 3}};
        int[][] result = findQuotientOf(array1, array2);
        System.out.println(Arrays.deepToString(result));
    }

    private static int[][] findQuotientOf(int[][] array1, int[][] array2) {
        if (array1 == null || array2 == null) {
            throw new RuntimeException("Массив не может быть NULL");
        }
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов должны быть равны");
        }

        int[][] newArray = new int[array1.length][array1.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i][j] == 0) {
                    throw new RuntimeException("Делить на ноль нельзя");
                }
                newArray[i][j] = array1[i][j] / array2[i][j];
            }
        }
        return newArray;
    }
}
