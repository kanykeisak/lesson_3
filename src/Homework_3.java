import java.util.Arrays;

public class Homework_3 {
    public static void main(String[] args) {
        // 1
        double[] numbers = {1.1, 5.7, -3.4, 7.5, 3.5, -9.6, -5.5, 4.5, -6.9, -7.2, 3.8, -2.6, 8.3, 0.9, -5.1};
        // 2

        int count = 0; // положительные цифры
        double sum = 0; // сумма положительных цифр
        boolean numberOfNegative = false; // отрицательная цифра


        for (double element : numbers){
            if(!numberOfNegative){
                if (element < 0) {
                    numberOfNegative = true;
                }
            } else {
                if (element > 0) {
                    sum+=element;
                    count++;
                }
            }
        }
//        System.out.println(Arrays.toString(numbers));
        System.out.println("Среднее арифметическое значение равна " + sum + " / " + count + " = " + (sum / count));

    }
}
