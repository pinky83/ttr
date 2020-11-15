package service;

import model.Shape;

public class ShapeFactory {

    private static char[][] square = {
            {'Z','Z','Z'},
            {'O','Z','O'},
            {'O','Z','O'}
    };

    public static Shape createShape() {
        return new Shape(0, square);
    }
}
