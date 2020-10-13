package ru.geekbrains;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое имя");
        String a = scanner.next();
        name(a);
        System.out.println("Привет, " + name(a) + "!");
    }
    private static String name(String a){
        return a;
    }
}
