package ru.geekbrains;

import java.util.Arrays;

public class maxOrMinArrayElement {
    public static void main(String[] args) {
        int[] arr = {
                5, 2, 15, 23, 7, 12, 6, 19
        };
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
                System.out.println("Максимальный элемент массива = " + max);
                System.out.println("Минимальный элемент массива = " + min);
    }
}
