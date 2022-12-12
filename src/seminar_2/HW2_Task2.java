package seminar_2;

// Если необходимо, исправьте данный код
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
// try {
//   int d = 0;
//   double catchedRes1 = intArray[8] / d;
//   System.out.println("catchedRes1 = " + catchedRes1);
//} catch (ArithmeticException e) {
//   System.out.println("Catching exception: " + e);
//}
public class HW2_Task2 {
    public static void main(String[] args) {
        double d = 2.7;
        double[] array = {1.9, 2.1, 3.4, 4.6, 5.2, 6.9, 7.2, 8.0, 9.1, 10.6};
        double result = divideElementByNumber(array, 8, d);
        System.out.println("result = " + result);
        System.out.printf("Value of double up-to 2 decimals : %.2f", result);
    }
    private static double divideElementByNumber(double[] array, int i, double num) {
        if (i >= array.length) {
            throw new ArrayIndexOutOfBoundsException("No such element in the array");
        }
        if (num == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return array[i] / num;
    }
}
