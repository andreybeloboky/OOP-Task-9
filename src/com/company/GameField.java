package com.company;

public class GameField {

    private int[][] array;
    private int squareX;
    private int squareY;
    private int result;
    static int prize = 7;
    static int trapped = 6;
    static int gameAgain = 0;

    /**
     * @param coordinates - the point for start game.
     */
    public GameField(Point coordinates, Field field) {
        this.squareX = coordinates.getSquareX();
        this.squareY = coordinates.getSquareY();
        this.array = field.getArray();
    }

    public void goStraight() {
        if (array[squareX + 1][squareY] == 1) {
            this.squareX = squareX + 1;
        } else if (array[squareX + 1][squareY] == 2) {
            this.result = prize;
        } else {
            System.out.println("You are trapped");
            this.result = trapped;
        }
    }

    public void goBack() {
        if (array[squareX - 1][squareY] == 1) {
            this.squareX = squareX - 1;
        } else if (array[squareX - 1][squareY] == 2) {
            this.result = prize;
        } else {
            System.out.println("You are trapped");
            this.result = trapped;
        }
    }

    public void goLeft() {
        if (array[squareX][squareY - 1] == 1) {
            this.squareY = squareY - 1;
        } else if (array[squareX][squareY - 1] == 2) {
            this.result = prize;
        } else {
            System.out.println("You are trapped");
            this.result = trapped;
        }
    }

    public void goRight() {
        if (array[squareX][squareY + 1] == 1) {
            this.squareY = squareY + 1;
        } else if (array[squareX][squareY + 1] == 2) {
            this.result = prize;
        } else {
            System.out.println("You are trapped");
            this.result = trapped;
        }
    }

    public int getResult() {
        return result;
    }

    /**
     * @param squareX - the point X at the game for start.
     */
    public void setSquareX(int squareX) {
        this.squareX = squareX;
        this.result = gameAgain;
    }

    /**
     * @param squareY - the point Y at the game for start.
     */
    public void setSquareY(int squareY) {
        this.squareY = squareY;
        this.result = gameAgain;
    }
}
