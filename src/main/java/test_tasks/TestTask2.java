package test_tasks;

import java.util.Scanner;

/**
 * Задание: Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
 * если нет, то вывести "Нет такого имени"
 */
public class TestTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        System.out.println();
        String inputName = scanner.nextLine();
        if (inputName.equals("Вячеслав") || inputName.equals("вячеслав")) {
            System.out.println("Привет, Вячеслав!");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
