package model;

import model.Impl.ConsoleGameField;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameFieldTest {

    private ConsoleGameField consoleGameField = new ConsoleGameField(10, 20);
    private char[][] shortLineArray = {{'X', 'X', 'X'},
                                       {'O', 'O', 'X'}};
    private char[][] sqare = {{'X', 'X'},
                             {'X', 'X'}};


    private final Shape currentShape = new Shape(3, shortLineArray);

    @BeforeEach
    void setUp() {
        consoleGameField.init();
        currentShape.setColor(ShapeColor.RED);
    }

    @Test
    void testGameFieldInitOk() {
        consoleGameField.drawField();
    }

    @Test
    void testSetShapeLandscapeLeft() {
        currentShape.setOrientation(Orientation.LANDSCAPE_LEFT);
        consoleGameField.setCurrentShape(currentShape);

        //clockwise rotate 2 times for LANDSCAPE_RIGHT
        char[] firstLineValues = {'X', 'O', 'O'};
        char[] secondLineValues = {'X', 'X', 'X'};

        consoleGameField.drawField();

        char[] currentFirstLineValues = {consoleGameField.getFieldArray()[3][0], consoleGameField.getFieldArray()[4][0], consoleGameField.getFieldArray()[5][0]};
        char[] currentSecondLineValues = {consoleGameField.getFieldArray()[3][1], consoleGameField.getFieldArray()[4][1], consoleGameField.getFieldArray()[5][1]};

        assertArrayEquals(firstLineValues, currentFirstLineValues);
        assertArrayEquals(secondLineValues, currentSecondLineValues);
    }

    @Test
    void testSetShapeLandscapeRight() {
        currentShape.setOrientation(Orientation.LANDSCAPE_RIGHT);
        consoleGameField.setCurrentShape(currentShape);

        char[] firstLineValues = {'X', 'X', 'X'};
        char[] secondLineValues = {'O', 'O', 'X'};

        consoleGameField.drawField();

        char[] currentFirstLineValues = {consoleGameField.getFieldArray()[3][0], consoleGameField.getFieldArray()[4][0], consoleGameField.getFieldArray()[5][0]};
        char[] currentSecondLineValues = {consoleGameField.getFieldArray()[3][1], consoleGameField.getFieldArray()[4][1], consoleGameField.getFieldArray()[5][1]};

        assertArrayEquals(firstLineValues, currentFirstLineValues);
        assertArrayEquals(secondLineValues, currentSecondLineValues);
    }

    @Test
    void testSetShapePortraitUp() {
        currentShape.setOrientation(Orientation.PORTRAIT_UP);
        consoleGameField.setCurrentShape(currentShape);

        char[] firstLineValues = {'X', 'X'};
        char[] secondLineValues = {'X', 'O'};
        char[] thirdLineValues = {'X', 'O'};

        consoleGameField.drawField();

        char[] currentFirstLineValues = {consoleGameField.getFieldArray()[3][0], consoleGameField.getFieldArray()[4][0]};
        char[] currentSecondLineValues = {consoleGameField.getFieldArray()[3][1], consoleGameField.getFieldArray()[4][1]};
        char[] currentThirdLineValues = {consoleGameField.getFieldArray()[3][2], consoleGameField.getFieldArray()[4][2]};

        assertArrayEquals(firstLineValues, currentFirstLineValues);
        assertArrayEquals(secondLineValues, currentSecondLineValues);
        assertArrayEquals(thirdLineValues, currentThirdLineValues);
    }

    @Test
    void testSetShapePortraitDown() {
        currentShape.setOrientation(Orientation.PORTRAIT_DOWN);
        consoleGameField.setCurrentShape(currentShape);

        char[] firstLineValues = {'O', 'X'};
        char[] secondLineValues = {'O', 'X'};
        char[] thirdLineValues = {'X', 'X'};

        consoleGameField.drawField();

        char[] currentFirstLineValues = {consoleGameField.getFieldArray()[3][0], consoleGameField.getFieldArray()[4][0]};
        char[] currentSecondLineValues = {consoleGameField.getFieldArray()[3][1], consoleGameField.getFieldArray()[4][1]};
        char[] currentThirdLineValues = {consoleGameField.getFieldArray()[3][2], consoleGameField.getFieldArray()[4][2]};

        assertArrayEquals(firstLineValues, currentFirstLineValues);
        assertArrayEquals(secondLineValues, currentSecondLineValues);
        assertArrayEquals(thirdLineValues, currentThirdLineValues);
    }

    @Test
    void testCheckFilledLines() {
        fail("Not implemented");
    }

    @Test
    void testCheckcollision() {
        fail("Not implemented");
    }

    @Test
    void testUpdate() {
        fail("Not implemented");
    }
}