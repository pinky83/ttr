package model.Impl;

import model.GameField;

public class ConsoleGameField extends GameField {

    public ConsoleGameField(int width, int height) {
        super(width, height);
    }

    @Override
    public void drawField() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                System.out.print(fieldArray[x][y]);
            }
            System.out.println();
        }
    }
}
