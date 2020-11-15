package model;

public abstract class GameField {
    protected char[][] fieldArray;
    protected int width;
    protected int height;
    private Shape currentShape;

    public GameField(int width, int height) {
        this.width = width;
        this.height = height;
        fieldArray = new char[width][height];
    }

    public void init() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                fieldArray[x][y] = 'O';
            }
        }
    }

    public void setCurrentShape(Shape currentShape) {
        this.currentShape = currentShape;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public abstract void drawField();

    //check if some lines filled and shift all values
    //TODO to be implemented
    public void checkFilledLines() {
        currentShape.move(Direction.DOWN);
        if (currentShape.isGroundTouched()) {
            currentShape = null;
        }
    }
}
