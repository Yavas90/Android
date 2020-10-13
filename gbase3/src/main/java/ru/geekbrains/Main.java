package ru.geekbrains;

public class Main {
    public static void main(String[] args) {
        float a = 5.5F;
        float b = 2.25F;
        float c = 25.1F;
        float d = 3.2F;

        result(a, b, c, d);
        System.out.println("Результат вычисляемого выражения = " + result(a, b, c, d));
    }
    public static float result(float a, float b, float c, float d){
        float e = a * (b + (c / d));
        return e;
    }
}
