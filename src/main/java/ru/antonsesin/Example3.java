package ru.antonsesin;

import java.util.ArrayList;

public class Example3 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("12");
        for (String s : arrayList) {
            System.out.println(s);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
        }
        int j =0;
        do {
            j++;
            System.out.println(j);
        } while (j==100);
    }
}
