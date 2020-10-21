package ru.geekbrains;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Положительное или отрицательное?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        number(a);
    }
    private static void number(int a){
        if (a >= 0){
            System.out.println("Вы ввели положительное число!");
        } else 
            System.out.println("Вы ввели отрицательно число!");
    }
}
