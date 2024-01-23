package test_tasks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задание: Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
 */
public class TestTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите значения элементов массива:");
        for (int i = 0; i < size; i++) {
            System.out.println("Введите " + (i + 1) + " - й элемент массива:");
            array[i] = scanner.nextInt();
        }
        System.out.println("Исходный массив: \n" + Arrays.toString(array));
        System.out.println("Элементы массива кратные 3: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
