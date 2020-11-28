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

    public char[][] getFieldArray() {
        return fieldArray;
    }

    public void setCurrentShape(Shape currentShape) {
        this.currentShape = currentShape;
        addShape(currentShape);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public abstract void drawField();

    //check if some lines filled and shift all values and call creation of new shape
    //TODO to be implemented
    public void checkFilledLines() {
        currentShape.move(Direction.DOWN);
        if (currentShape.isGroundTouched()) {
            currentShape = null;
        }
    }

    //check if figure touched ground or walls and return collision direction (for current Shape)
    //will return Direction.UP if no collision
    public Direction checkcollision() {
        return Direction.UP;
    }

    //refresh field data - called every game iteration
    public void update() {

    }

    //adding current shape data to game field with
    private Shape addShape(Shape shape) {
        switch (shape.getOrientation()) {
            case LANDSCAPE_LEFT:
                //need to rotate two times for getting this position from
                // default LANDSCAPE_RIGHT (for live rotate also need to correct y coordinate)
                shape.rotate();
                shape.rotate();
                updateGameFieldArray(shape.getyCoord());
                break;
            case LANDSCAPE_RIGHT:
                updateGameFieldArray(shape.getyCoord());
                break;
            case PORTRAIT_UP:
                shape.rotate();
                shape.rotate();
                shape.rotate();
                updateGameFieldArray(shape.getyCoord());
                break;
            case PORTRAIT_DOWN:
                shape.rotate();
                updateGameFieldArray(shape.getyCoord());
                break;
        }

        return this.currentShape;
    }

    private void updateGameFieldArray(int yCoord) {
        int currentY;
        int currentX = 0;

        for (int x = currentShape.getxCoord(); x < currentShape.getxCoord() + currentShape.getShapeArray().length; x++) {
            currentY = 0;
            for (int y = yCoord; y < yCoord + currentShape.getShapeArray()[0].length; y++) {
                fieldArray[y][x] = currentShape.getShapeArray()[currentX][currentY];
                currentY++;
            }
            currentX++;
        }
    }
}
