package test_tasks;

import java.util.Scanner;

/**
 * Задание: Составить алгоритм: если введенное число больше 7, то вывести “Привет”
 */
public class TestTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        System.out.println();
        int inputNumber = scanner.nextInt();
        if (inputNumber > 7) {
            System.out.println("Привет");
        }
    }
}
