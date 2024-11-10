import java.util.Arrays;
import java.util.Scanner;

public class Lesson_3_3 {
    public static void main(String[] args) {
        // цикл
        for (int i = 1; i <= 3; i = i + 1){
//            System.out.println(i);
            int number = 2;
            System.out.println(i * number);
        }
        System.out.println("-------------");
        for (int i = 1; i <= 10; i++){// i = i + 1 => i++ increment
            System.out.println(" 7 x " + i +" = " + 7 * i);
        }
        System.out.println("-------------");
        for (int i = 10; i >= 1 ; i--) {
            System.out.println(" 9 x " + i +" = " + 9 * i);
        }
        System.out.println("-------------");
        for (int i = 10; i >= 2 ; i-= 2) { // i = i - 2 => i-= 2     i = i * 5 => i*= 5
            System.out.println(" 5 x " + i +" = " + 5 * i);
        }
        System.out.println("-------------");
        int a = 0;
        while (a < 5){
            a++;
            System.out.println("Number a = " + a);
        }
        System.out.println("-------------");
        String str = "Java programming";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.replace("a", "***"));
        System.out.println("-------------");
        str = "#";
        while(str.length() < 5){
            System.out.println(str);
            str = str + "#";
        }
        System.out.println("-------------");
//        int input = 1;
//        while(true){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter an integer (or 0 to exit): ");
//            int number = scanner.nextInt();
//            if (number == 0){
//                break; // экстренно прерывает работу всего цикла
//            }
//            System.out.println(number * number);
//        }
        String[] robots = new String[10];
//        robots[0] = "DI0001";
//        robots[1] = "DI0002";
//        robots[2] = "DI0003";
//        robots[3] = "DI0004";
//        robots[4] = "DI0005";
        for (int i = 0; i < robots.length; i++) {
            robots[i] = "DI000" + (i + 1);
        }
        System.out.println(Arrays.toString(robots));
        System.out.println("-------------");

        String[] names = {"John", "Jack", "Barbara"};
        for(String element : names){ // for each
            System.out.println("Hi " + element);
        }
//        int[] numbers = {34, -98, 14, -4, 88};
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < 0){
//                break;
//            }
//            System.out.println(numbers[i]);
//        }
//        System.out.println("-------------");
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < 0){
//                continue;// прерывает текущий круг(итерацию) цикла
//            }
//            System.out.println(numbers[i]);
//        }
//        System.out.println("-------------");
//        for (int i = 1; i <= 3 ; i++) {
//            System.out.println("Наружный цикл " + i);
//            for (int j = 1; j <= 5; j++) { // Nested loop
//                System.out.println("Внутренний цикл " + j);
//            }
//        }
    }
}
