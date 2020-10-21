package ru.geekbrains;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        int[] arr = new int[8];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i * 3;
            }
        System.out.println(Arrays.toString(arr));
    }
}
