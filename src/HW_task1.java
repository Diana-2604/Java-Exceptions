// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class HW_task1 {
    public static void main(String[] args) {
        System.out.println(divideNumbers(10, 0));

        System.out.println(findLastElementOf(new int[]{1, 2, 3, 4, 5}));

        String myString = null;
        printLengthOf(myString);
    }

    private static int divideNumbers(int a, int b) {
        return a / b; /* ArithmeticException */
    }

    private static int findLastElementOf(int[] numbers) {
//        return numbers[numbers.length-1];
        return numbers[numbers.length]; /* ArrayIndexOutOfBoundException */
    }

    private static void printLengthOf(String str) {
        System.out.println(str.length()); /* NullPointerException */
    }
}
