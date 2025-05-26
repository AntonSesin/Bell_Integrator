package ru.antonsesin;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if (i % 2 == 0) {
            System.out.println("Кратно 2");
        } else if (i % 3 == 0) {
            System.out.println("Кратно 3");
        } else if (i % 4 == 0) {
            System.out.println("Кратно 4");
        }

    }
}
