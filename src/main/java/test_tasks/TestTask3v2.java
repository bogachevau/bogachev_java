package test_tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Задание: Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
 */
public class TestTask3v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        System.out.println();
        int size = scanner.nextInt();
        List<Integer> array = new ArrayList<>();
        System.out.println("Введите значения элементов массива");
        for (int i = 0; i < size; i++) {
            System.out.println("Введите " + (i + 1) + " - й элемент массива:");
            array.add(scanner.nextInt());
        }
        System.out.println("Исходный массив: \n" + array);
        System.out.println("Элементы массива кратные 3:");
        for (int i: array) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
