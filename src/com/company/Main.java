package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a square for begin game");
        int squareX = scanner.nextInt();
        int squareY = scanner.nextInt();
        Point point = new Point(squareX, squareY);
        Field field = new Field(point);
        GameField gameField = new GameField(point, field);
        int result;
        int trapped = 6;
        int prize = 7;
        int gameOver = 8;
        do {
            System.out.println("Choose action 1 - step straight, 2 - step back, 3 - step left, 4 - step right, another number - the end game");
            int i = scanner.nextInt();
            switch (i) {
                case 1 -> gameField.goStraight();
                case 2 -> gameField.goBack();
                case 3 -> gameField.goLeft();
                case 4 -> gameField.goRight();
            }
            result = gameField.getResult();
            if (result == trapped) {
                System.out.println("If you want begin this game again tip - 1, if you want begin this game with new map tip - 2");
                System.out.println("If you want game over this game tip - another number");
                int game = scanner.nextInt();
                if (game == 1) {
                    gameField.setSquareX(squareX);
                    gameField.setSquareY(squareY);
                } else if (game == 2) {
                    gameField.setSquareX(squareX);
                    gameField.setSquareY(squareY);
                    field.createRandomMap();
                } else {
                    result = gameOver;
                }
            }
            if (result == prize) {
                System.out.println("You are win. Congratulation!");
            }
        } while (result != prize && result != gameOver);
        System.out.println("The end");
    }
}
