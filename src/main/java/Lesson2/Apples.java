package Lesson2;

import java.util.Scanner;

public class Apples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        System.out.println("Введите количество яблок: ");
        int number = scanner.nextInt();

        printAppleStorage(name, number);
    }

    public static void printAppleStorage(String name, int number) {
        String declensionOfApples = "";

        if (number < 0 || number > 100) {
            System.out.println("Введенное значение некорректно");
            return;
        } else if (number % 10 == 1 && number % 100 != 11) {
            declensionOfApples = "яблоко";
        } else if (number % 10 >= 2 && number % 10 <= 4 && (number % 100 < 10 || number % 100 >= 20)) {
            declensionOfApples = "яблока";
        } else {
            declensionOfApples = "яблок";
        }

        System.out.println(name + " хранит " + number + " " + declensionOfApples);
    }
}