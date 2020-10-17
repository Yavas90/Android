package ru.geekbrains;

import java.util.Arrays;

public class checkBalance {
    public static void main(String[] args){
        int[] arr = {
                2, 3, 5, 8, 12, 8, 1, 3, 36
        };
        check(arr);
        System.out.println(check(arr));
    }
    public static boolean check(int[] arr) {
        if (arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] + arr[6] == arr[7] + arr[8]) {
            return true;
        } return false;
    }
}
