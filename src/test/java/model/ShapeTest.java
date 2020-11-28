package model;


import model.Impl.ConsoleGameField;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class ShapeTest {

    private ConsoleGameField consoleGameField = new ConsoleGameField(10, 40);
    private char[][] shortLine = {{'X','X','X'},
                                  {'O','O','X'}};
    private char[][] sqare = {{'X','X'},
                              {'X','X'}};

    private Shape currentShape = new Shape(1, shortLine);

    @BeforeEach
    void setUp() {
        consoleGameField.init();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void testMoveLeftWithoutCollision() {
        fail("Not implemented");
    }

    @Test
    void testMoveLeftWithCollision() {
        fail("Not implemented");
    }

    @Test
    void testMoveRightWithoutCollision() {
        fail("Not implemented");
    }

    @Test
    void testMoveRightWithCollision() {
        fail("Not implemented");
    }

    @Test
    void testMoveDownWithoutCollision() {
        fail("Not implemented");
    }

    @Test
    void testMoveDownWithCollision() {
        fail("Not implemented");
    }

    @Test
    void testGroundTouched() {
        fail("Not implemented");
    }

    @Test
    void rotate() {
        fail("Not implemented");
    }

    @Test
    void speedup() {
        fail("Not implemented");
    }
}