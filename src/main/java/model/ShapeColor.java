package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum ShapeColor {
    GREEN, RED, YELLOW, BLUE, CYAN, ORANGE, PURPLE;

    private static final List<ShapeColor> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static ShapeColor randomColor()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
