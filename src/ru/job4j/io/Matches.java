package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] players = {"Игрок1", "Игрок2"};
        String currentPlayer = players[0];
        int numMatches = 11;
        while (numMatches != 0) {
            System.out.print(currentPlayer + ", возьмите от 1 до 3 спичек: ");
            int select = Integer.parseInt(input.nextLine());
            if (select != 1 && select != 2 && select != 3) {
                System.out.println("Вы ввели некорректное значение.");
            } else if (select > numMatches) {
                System.out.println("Вы пытаетесь взять больше спичек чем осталось.");
            } else {
                numMatches -= select;
                System.out.println("Осталось спичек: " + numMatches);
                if (numMatches == 0) {
                    System.out.println("Победил: " + currentPlayer);
                } else {
                    currentPlayer = currentPlayer.equals(players[0]) ? players[1] : players[0];
                }
            }
        }
    }
}
