package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] players = {"Игрок1", "Игрок2"};
        String currentPlayer = players[0];
        int numMatches = 11;
        while (numMatches > 0) {
            System.out.print(currentPlayer + ", возьмите от 1 до 3 спичек: ");
            int select = Integer.parseInt(input.nextLine());
            while (select < 1 || select > 3) {
                System.out.println("Введено некорректное значение.");
                select = Integer.parseInt(input.nextLine());
            }
            numMatches -= select;
            if (numMatches <= 0) {
                System.out.println("Спичек не осталось");
            } else {
                System.out.println("Осталось спичек: " + numMatches);
                currentPlayer = currentPlayer.equals(players[0]) ? players[1] : players[0];
            }
        }
        System.out.println("Победил: " + currentPlayer);
    }
}

