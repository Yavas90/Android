package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
        int [] [] table = new int[4] [4];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == table[0][0]) {
                    table[0][0] = 1;
                } else if (table[i][j] == table[1][1]) {
                    table[1][1] = 1;
                } else if (table[i][j] == table[2][2]) {
                    table[2][2] = 1;
                } else if (table[i][j] == table[3][3]) {
                    table[3][3] = 1;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
