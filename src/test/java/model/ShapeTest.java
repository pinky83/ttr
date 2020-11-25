package model;


import model.Impl.ConsoleGameField;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class ShapeTest {

    private ConsoleGameField consoleGameField = new ConsoleGameField(10, 40);
    private char[][] shortLine = {{'O','O','O'}};
    private char[][] sqare = {{'O','O'},
                              {'O','O'}};

    private Shape currentShape = new Shape(1, shortLine);

    @BeforeAll
    static void beforeAll() {

    }

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void isGroundTouched() {
        fail("Not implemented");
    }

    @Test
    void move() {
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