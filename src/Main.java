import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

       float drob = showString();
        System.out.println(drob);


////        Задание 2
//        try {
//            int d = 0;
//            int[] intArray = new int[]{1, 123};
//            double catchedRes1 = intArray[1] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }
//
////        Задание 3
//            try {
//                int a = 90;
//                int b = 3;
//                System.out.println(a / b);
//                printSum(23, 234);
//                int[] abc = { 1, 2 };
//                abc[3] = 9;
//            } catch (NullPointerException ex) {
//                System.out.println("Указатель не может указывать на null!");
//            } catch (IndexOutOfBoundsException ex) {
//                System.out.println("Массив выходит за пределы своего размера!");
//            } catch (Throwable ex) {
//                System.out.println("Что-то пошло не так...");
//                }
    }

//    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//            System.out.println(a + b);
//        }


    // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    private static void showSomeString() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str.length() == 0) {
            throw new RuntimeException("пустые строки вводить нельзя!");
        }
    }

    //        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//        и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//        вместо этого, необходимо повторно запросить у пользователя ввод данных.
    private static float showString() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("введите дробное число:");
            return Float.parseFloat(scan.nextLine());
        } catch (Exception e) {
            System.out.println ("Введено неверное значение");
            return showString();
        }
    }
}



