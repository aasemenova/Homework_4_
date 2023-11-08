package Lesson1;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        String convertedResult = convertNumber(number);
        System.out.println("Результат конвертации: " + convertedResult);
    }

    public static String convertNumber(int number) {
        String result = number > 0 ? number % 7 < 4 ? "positive-m" : "positive-p" : number == 0 ? "zero" : (number % 7 > -4 ? "negative-m" : "negative-p");
        return result;
    }
}