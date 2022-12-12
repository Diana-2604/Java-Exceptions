package seminar_1;// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
// Необходимо посчитать и вернуть сумму элементов этого массива.
// При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
// (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
// Если нарушается одно из условий, метод должен выбросить RuntimeException с сообщением об ошибке

public class Task2 {
    public static void main(String[] args) {
        int[][] array = {{1, 0}, {1, 1}};
        System.out.println(sumOf(array));

    }
    private static int sumOf(int[][] array) {
        if (array == null) {
            throw new RuntimeException("Массив не может быть NULL");
        }
        if (array.length != array[0].length) {
            throw new RuntimeException("Количество строк должно быть равно количеству столбцов");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 1 && array[i][j] != 0) {
                    throw new RuntimeException("Значения могут быть только 0 или 1");
                }
                sum += array[i][j];
            }
        }
        return sum;
    }
}
