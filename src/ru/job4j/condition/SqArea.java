package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        int h = p / (2 * (k + 1));
        int l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        System.out.println(" p = 6, k = 2, real = " + SqArea.square(6, 2));
    }
}
