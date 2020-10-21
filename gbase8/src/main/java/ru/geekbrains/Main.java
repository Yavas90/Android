package ru.geekbrains;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите год!");
        double year = scanner.nextDouble();
        scanner.close();
        firstCheck(year);
        secondCheck(year);
        finalCheck(year);

        if (firstCheck(year) && !secondCheck(year) || finalCheck(year)){
            System.out.println("Указанный год високосный!");
        } else
            System.out.println("Указанный год не является високосным!");
    }
    private static boolean firstCheck(Double year){
        if (year/4 == year.intValue()/4){
            return true;
        } return false;
    }
    public static boolean secondCheck(Double year){
        if (year/100 == year.intValue()/100){
            return true;
        } return false;
    }
    public static boolean finalCheck(Double year){
        if (year/400 == year.intValue()/400){
            return true;
        }return false;
    }
}
