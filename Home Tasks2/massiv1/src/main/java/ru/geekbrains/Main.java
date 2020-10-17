package ru.geekbrains;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 1, 0, 0, 1, 0};
        System.out.println("Массив до изменений " + Arrays.toString(arr));
        System.out.println("Длина массива " + arr.length + " элементов!");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        } System.out.print(Arrays.toString(arr));
    }
}
