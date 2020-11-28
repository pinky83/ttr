package model.Impl;

import model.GameField;

public class ConsoleGameField extends GameField {

    public ConsoleGameField(int width, int height) {
        super(width, height);
    }

    @Override
    //TODO need to implement colored output
    public void drawField() {
        System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +
                "* * * * * * * * * * * * * * *  *" + ConsoleColors.RESET);
        for (int x = 0; x < height; x++) {
            System.out.print(ConsoleColors.CYAN_BOLD_BRIGHT + "*" + ConsoleColors.RESET);
            for (int y = 0; y < width; y++) {
                System.out.print(" " + fieldArray[y][x] + " ");
            }
            System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "*" + ConsoleColors.RESET);
        }
        System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "* * * * * * * * * * * * * * *  *" + ConsoleColors.RESET);
    }
}
