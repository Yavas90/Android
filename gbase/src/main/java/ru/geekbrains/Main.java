package ru.geekbrains;

public class Main {
    public static void main(String[] args) {
        byte a = 100;
        byte b =120;
        int c = a + b;
        System.out.println("Сумма двух чисел с типом данных byte = " + c);

        short s = 11244;
        short e = 12549;
        int f = s + e;
        System.out.println("Сумма двух чисел с типом данных short = " + f);

        int w = 96542;
        int k = 5321478;
        int g = w + k;
        System.out.println("Сумма двух чисел с типом данных int = " + g);

        long i = 5689523145L;
        long h = 3265896652145L;
        long j = i + h;
        System.out.println("Сумма двух чисел с типом данных long = " + j);

        float y = 23.52f;
        float p = 78.61f;
        float r = y + p;
        System.out.println("Сумма двух чисел с типом данных float = " + r);

        double n = 5.235;
        double u = 78.3654;
        double q = n + u;
        System.out.println("Сумма двух чисел с типом данных double = " + q);

        char m = '*';
        System.out.println("Вывод символа с типом данных char = " + m);

        int az = 10;
        boolean zx = az < 15 && az > 5;
        System.out.println("Результат типа boolean = " + zx);

    }
}
