package ru.antonsesin;

import java.util.Arrays;
import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        /*Создайте массив из 20 элементов, наполненный рандомными значениями в диапазоне (-50, 50)
        и реализуйте метод его сортировки (без использования сторонних библиотек).
        Вывести сам массив и сортированный массив*/

        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-50, 50);
        }
        System.out.println(Arrays.toString(array));

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));

            int n = array.length;
            for (int i = 0; i < n; i++) {
                // Последние i элементов уже на своих местах
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] < array[j + 1]) {
                        // Меняем местами array[j] и array[j + 1]
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }

        System.out.println(Arrays.toString(array));


    }
}
