package com.company;

public class Field {

    private int[][] array = new int[10][10];
    private int squareX;
    private int squareY;
    private int randomMap;

    public Field(Point coordinates) {
        this.squareX = coordinates.getSquareX();
        this.squareY = coordinates.getSquareY();
        this.createRandomMap();
    }

    public void createRandomMap() {
        int firstMap = 1;
        int lastMap = 3;
        randomMap = firstMap + (int) (Math.random() * lastMap);
        this.fillTab();
    }

    public int[][] getArray() {
        return array;
    }

    private void fillTab() {
        System.out.println(randomMap);
        if (randomMap == 1) {
            array[squareX][squareY] = 1;
            array[squareX + 1][squareY] = 1;
            array[squareX + 2][squareY] = 1;
            array[squareX + 2][squareY + 1] = 1;
            array[squareX + 2][squareY + 2] = 1;
            array[squareX + 3][squareY + 2] = 2;
            printFieldOnScreen();
        } else {
            if (randomMap == 2) {
                array[squareX][squareY] = 1;
                array[squareX + 1][squareY] = 1;
                array[squareX + 2][squareY] = 1;
                array[squareX + 3][squareY] = 1;
                array[squareX + 4][squareY] = 1;
                array[squareX + 5][squareY] = 2;
                printFieldOnScreen();
            } else {
                if (randomMap == 3) {
                    array[squareX][squareY] = 1;
                    array[squareX][squareY + 1] = 1;
                    array[squareX][squareY + 2] = 1;
                    array[squareX][squareY + 3] = 1;
                    array[squareX + 1][squareY + 3] = 1;
                    array[squareX + 1][squareY + 4] = 2;
                    printFieldOnScreen();
                }
            }
        }
    }

    private void printFieldOnScreen() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
