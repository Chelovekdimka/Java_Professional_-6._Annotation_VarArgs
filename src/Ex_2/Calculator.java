package Ex_2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Scanner;

/**
 * Клас, що реалізує простий калькулятор для додавання, віднімання, множення та ділення чисел.
 * @author Romaniuk Dmytro
 * @version 1.0
 * @since 23/03/2023
 *
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String str();
    int val();
}
@MyAnnotation(str = "Calculator", val = 100)
public class Calculator {

    /**
     * Метод, що додає два числа.
     *
     * @param a перше число для додавання
     * @param b друге число для додавання
     * @return сума чисел a та b
     */
    @MyAnnotation(str = "Method", val = 200)
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Метод, що віднімає два числа.
     *
     * @param a число, з якого віднімають
     * @param b число, яке віднімають
     * @return різниця чисел a та b
     */
    @MyAnnotation(str = "Method", val = 200)
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Метод, що множить два числа.
     *
     * @param a перше число для множення
     * @param b друге число для множення
     * @return добуток чисел a та b
     */
    @MyAnnotation(str = "Method", val = 200)
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Метод, що ділить два числа.
     *
     * @param a ділене число
     * @param b дільник
     * @return частка чисел a та b
     * @throws ArithmeticException виникає, коли дільник b дорівнює нулю
     */

     @MyAnnotation(str = "Method", val = 200)
     public int divide(int a, int b) {
        try {
        return a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        return 0;
        }
     }

    public static void main(String[] args) {
        System.out.println();
    }
 }