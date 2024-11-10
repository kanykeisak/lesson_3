import java.util.Arrays;
import java.util.jar.JarEntry;

public class Lesson_3_2 {
    public static void main(String[] args) {
        int [] numbers = {11, -2, 0, 31, 7}; //массив ( локальный), фиксированная длина
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[3]);
        numbers[2] = 88;
        System.out.println(Arrays.toString(numbers));
        double[] digits = new double[3];
        // double -> 0.0
        // boolean -> false - 0
        // char -> '0'
        // String -> null
        System.out.println(Arrays.toString(digits));
        digits[1] = 1.5;
        System.out.println(Arrays.toString(digits));
        digits = new double[5];
        System.out.println(Arrays.toString(digits));

        int[][] array2D = new int[4][5];
        array2D[1][2] = 8;
        System.out.println(Arrays.deepToString(array2D));

        String[][] students = {{"Jim", "Bob"},{"Jane", "Mary"}};
        System.out.println(Arrays.deepToString(students));



    }
}
