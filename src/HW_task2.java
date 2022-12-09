// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
public class HW_task2 {
    public static void main(String[] args) {
        String[][] newArray = new String[2][2];
        newArray[0][0] = "2";
//        newArray[0][1] = "0";
        newArray[0][1] = "hello";
        newArray[1][0] = "6";
        newArray[1][1] = "8";
        System.out.println(sum2d(newArray));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) { /* ArrayIndexOutOfBoundsException */
                int val = Integer.parseInt(arr[i][j]); /* NumberFormatException - Cannot parse null string,
                NumberFormatException - For input string: "hello" */
                sum += val;
            }
        }
        return sum;
    }
}
