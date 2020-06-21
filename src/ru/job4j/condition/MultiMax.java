package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int maxFirstSecond = first > second ? first : second;
        return maxFirstSecond > third ? maxFirstSecond : third;
    }
}
