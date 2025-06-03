package ru.antonsesin;

public class Example4 {
    /*Напишите программу на Java, в которой должен быть реализован метод countVowels(),
    который получает в качестве аргумента строку и подсчитывает число
    гласных (a, e, i, o, u) в этой строке и возвращает это число.
            Пример:
            *   Ввод: "Hello World!"
            *   Вывод: 3*/

    public static void main(String[] args) {
        String text = "Hello World!";
        System.out.println("Ввод: " + text);
        System.out.println("Вывод: " + countVowels(text));

    }

    public static int countVowels(String text) {
        text = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
