package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static boolean testing(int expected, int out) {
        return expected == out;
    }

    public static void main(String[] args) {
        System.out.println("140 rubles are " + rubleToEuro(140) + " euro.");
        System.out.println("240 rubles are " + rubleToDollar(240) + " dollars.");
        System.out.println("140 rubles are 2 euro. Test result : " + testing(2, rubleToEuro(140)));
        System.out.println("240 rubles are 4 dollars. Test result : " + testing(4, rubleToDollar(240)));
    }
}
