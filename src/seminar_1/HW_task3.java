package seminar_1;// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен
// разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Вместо массива может прийти null (обработать)

import java.util.Arrays;

public class HW_task3 {
    public static void main(String[] args) {
        int[][] array1 = {{10, 5}, {3, 9}};
        int[][] array2 = {{1, 8}, {5, 2}};
        int[][] result = getDifferenceOf(array1, array2);
        System.out.println(Arrays.deepToString(result));

    }

    private static int[][] getDifferenceOf(int[][] array1, int[][] array2) {
        if (array1 == null || array2 == null) {
            throw new RuntimeException("Массив не может быть NULL");
        }
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов должны быть равны");
        }

        int[][] newArray = new int[array1.length][array1.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                newArray[i][j] = array1[i][j] - array2[i][j];
            }
        }
        return newArray;
    }
}
