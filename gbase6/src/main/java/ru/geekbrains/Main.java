package ru.geekbrains;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("True or False!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        number(a);
        System.out.println(number(a));
    }
    public static boolean number(int a){
        if (a >= 0){
            return true;
        } else
            return false;
    }
}
