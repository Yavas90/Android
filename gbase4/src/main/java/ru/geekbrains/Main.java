package ru.geekbrains;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Узнаем, находится ли сумма указанных вами чисел в пределах от 10 до 20!");
            System.out.println("Введите число a");
            int a = scanner.nextInt();
            System.out.println("Введите число b");
            int b = scanner.nextInt();
            answer(a, b);
            System.out.println(answer(a, b));
        }
        private static boolean answer(int a, int b){
            if (a + b >= 10 && a + b <= 20){
                return true;
            } return false;
        }
}
