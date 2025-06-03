package ru.antonsesin;

import java.util.Scanner;

public class Example6 {
   /* Напишите программу на Java, которая создает двумерный массив NxM, наполняет его случайными значениями, после
   чего для каждого элемента массива вычисляет сумму его соседей (сверху, снизу, слева и справа) и сохраняет
    эти суммы в новом двумерном массиве того же размера.

    Требования к программе:
            1. Создайте двумерный массив целых чисел (int[][]) размером N x M. Размерность массива задается
            пользователем (запрашивается в консоли).
            2. Заполните его случайными числами от 1 до 9 (должен быть реализован метод заполнения случайными значениями).
            3. Создайте второй двумерный массив того же размера для хранения сумм соседей.
            4. Для каждого элемента вычислите сумму его соседей в ближайших соседних ячейках (по диагонали НЕ учитывать):
            • Если у элемента нет соседа сверху (первая строка), не учитывайте его.
            • Если у элемента нет соседа снизу (последняя строка), не учитывайте его.
            • Если у элемента нет соседа слева (первый столбец), не учитывайте его.
            • Если у элемента нет соседа справа (последний столбец), не учитывайте его.
            5. Запишите полученную сумму в соответствующую ячейку второго массива.
            6. Выведите оба массива (исходный и с суммами) на экран для проверки.
    Пример:
    Сгенерированный массив
        1 2 3
        4 5 6
        7 8 9
    Массив после вычисления
        6 9 8
        13 20 17
        12 21 14
*/

    public static void main(String[] args) {
        int N;
        int M;
        int[][] array;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размеры массива");
        System.out.println("Введите количество строк:");
        N = scanner.nextInt();
        System.out.println("Введите количество столбцов:");
        M = scanner.nextInt();
        array = getArray(N, M);
        System.out.println("Исходный массив:");
        printArray(array);
        int[][] arraySum = getNewArray(array, N, M);
        System.out.println("Массив в суммами:");
        printArray(arraySum);
    }

    public static int[][] getArray(int N, int M) {
        int[][] array = new int[N][M];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getRandom();
            }
        }
        return array;
    }

    public static int[][] getNewArray(int[][] array, int N, int M) {
        int sum = 0;
        int[][] newArray = new int[N][M];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i > 0) {
                    sum += array[i - 1][j];
                }
                if (i < array.length - 1) {
                    sum += array[i + 1][j];
                }
                if (j > 0) {
                    sum += array[i][j - 1];
                }
                if (j < array[i].length - 1) {
                    sum += array[i][j + 1];
                }
                newArray[i][j] = sum;
                sum = 0;
            }
        }
        return newArray;
    }

    public static int getRandom() {
        return (int) (Math.random() * 10);
    }

    public static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
