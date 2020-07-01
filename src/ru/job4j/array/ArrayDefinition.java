package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] price = new float[40];
        String[] names = new String[4];
        names[0] = "James Gosling";
        names[1] = "Richard Stallman";
        names[2] = "Bjarne Stroustrup";
        names[3] = "Linus Torvalds";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
