public class Lesson_3_1 {

    public static double digit;// глобольная переменная

    public static void test(int num){ // локальная переменная
        System.out.println(num);

        int a = 98;
        System.out.println(a);
        if(num > a) {
            System.out.println(a);
            int b = 11;
            System.out.println(b);
            System.out.println(digit);
        }
//        System.out.println();
        System.out.println(digit);



    }

    public static void main(String[] args) {
//        System.out.println(num);
        System.out.println(digit);
    }
}
